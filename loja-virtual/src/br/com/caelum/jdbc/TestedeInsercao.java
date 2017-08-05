package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.connectionPoll.ConnectionPool;
import br.com.caelum.jdbc.dao.ProdutosDAO;
import br.com.caelum.jdbc.modelo.Produto;

public class TestedeInsercao {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionPool().getConnection()) {

			ProdutosDAO produtosDAO = new ProdutosDAO(connection);
			Produto produto = new Produto("Cama amarela Marinho", "Cama de casal.");

			produtosDAO.salva(produto);

			produtosDAO.lista();
 
			List<Produto> produtos = produtosDAO.lista();
			for (Produto iteraProduto : produtos) {
				System.out.println("Existe o produto: " + iteraProduto);
			}

		}
	}
}