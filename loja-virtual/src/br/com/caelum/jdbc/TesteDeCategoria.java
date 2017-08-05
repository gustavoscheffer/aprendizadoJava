package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.connectionPoll.ConnectionPool;
import br.com.caelum.jdbc.dao.CategoriaDAO;
import br.com.caelum.jdbc.modelo.Categoria;
import br.com.caelum.jdbc.modelo.Produto;

public class TesteDeCategoria {

	public static void main(String[] args) throws SQLException {

		try (Connection con = new ConnectionPool().getConnection()) {
			
			List<Categoria> categorias = new CategoriaDAO(con).listaComProdutos();
			
			for (Categoria categoria : categorias) {
				System.out.println(categoria.getNome().toUpperCase());
				for ( Produto produto : categoria.getListaDeProdutos()) {
					System.out.println("*  " + produto.getNome() + " , " + produto.getDescricao() );
				} 
				System.out.println();
			}
			
		}
	}
}
