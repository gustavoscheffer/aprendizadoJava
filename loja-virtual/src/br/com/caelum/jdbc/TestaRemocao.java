package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.caelum.jdbc.connectionPoll.ConnectionPool;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {

		ConnectionPool connectionPool = new ConnectionPool();

		try (Connection connection = connectionPool.getConnection()) {

			try (Statement statement = connection.createStatement()) {
				String sql = "DELETE FROM Produto WHERE id>3";

				boolean resultado = statement.execute(sql);
				System.out.println(resultado);

				int count = statement.getUpdateCount();

				System.out.println("Total de linhas alteradas: " + count);

			}

		}

	}
}
