package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.connectionPoll.ConnectionPool;
import br.com.caelum.jdbc.dao.CategoriaDAO;
import br.com.caelum.jdbc.modelo.Categoria;

public class TestaCategoria {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionPool().getConnection()) {
			
			List<Categoria> categorias = new CategoriaDAO(connection).lista();
			
			for (Categoria categoria : categorias) {
				System.out.println(categoria.getNome());
			}

		}
	}

}
