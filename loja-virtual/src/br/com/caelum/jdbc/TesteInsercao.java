package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.caelum.jdbc.connectionPoll.ConnectionPool;

public class TesteInsercao {
	public static void main(String[] args) throws SQLException {

		ConnectionPool connectionPool = new ConnectionPool();
		
		try (Connection connection = connectionPool.getConnection()) {
			connection.setAutoCommit(false);
			
			String sql = "INSERT INTO Produto (nome, descricao) values (?,?)";

			try (PreparedStatement pstatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				adiciona("TV LCD", "TV 32 Polegadas", pstatement);
				adiciona("Blueray", "Full HDMI", pstatement);
				connection.commit();
				
			}catch (Exception ex) {
				ex.printStackTrace();
				connection.rollback();
				System.out.println("Rollback efetuado");
			}
		}

	}

	/**
	 * @param nome
	 * @param descricao
	 * @param pstatement
	 * @throws SQLException
	 */
	private static void adiciona(String nome, String descricao, PreparedStatement pstatement) throws SQLException {

		if (nome.equals("Blueray")) {
			throw new IllegalArgumentException("Produto invalido!!!");
		}

		pstatement.setString(1, nome);
		pstatement.setString(2, descricao);

		boolean resposta = pstatement.execute();
		System.out.println(resposta);

		try (ResultSet resultSet = pstatement.getGeneratedKeys()) {
			while (resultSet.next()) {
				String id = resultSet.getString("id");
				System.out.println(id + ": Este foi o ID gerado.");
			}
		}

	}
}
