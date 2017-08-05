package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.caelum.jdbc.connectionPoll.ConnectionPool;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {

		ConnectionPool connectionPool = new ConnectionPool();

		try (Connection connection = connectionPool.getConnection()) {

			try (Statement statement = connection.createStatement()) {

				@SuppressWarnings("unused")
				boolean resultado = statement.execute("SELECT * FROM Produto");

				try (ResultSet resultSet = statement.getResultSet()) {

					while (resultSet.next()) {
						int id = resultSet.getInt("id");
						String nome = resultSet.getString("nome");
						String descricao = resultSet.getString("descricao");

						System.out.println(id);
						System.out.println(nome);
						System.out.println(descricao);
					}
				}
			}
		}

	}

}
