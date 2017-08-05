package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.modelo.Categoria;
import br.com.caelum.jdbc.modelo.Produto;

public class CategoriaDAO {

	private final Connection connection;

	/**
	 * @param connection
	 */
	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Categoria> lista() throws SQLException {
		List<Categoria> lista = new ArrayList<>();
		String sql = "select * from Categoria";
		try (PreparedStatement pstm = this.connection.prepareStatement(sql)) {
			@SuppressWarnings("unused")
			boolean retorno = pstm.execute();

			transformaResultadoEmCategoria(pstm, lista);
		}

		return lista;
	}

	public List<Categoria> listaComProdutos() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		Categoria ultima = null;

		String sql = "select c.id as c_id, c.nome as c_nome, p.id as p_id, p.nome as p_nome, p.descricao as p_descricao from Categoria as c join Produto as p on p.categoria_id = c.id";
		PreparedStatement psPreparedStatement = connection.prepareStatement(sql);
		@SuppressWarnings("unused")
		boolean retorno = psPreparedStatement.execute();

		try (ResultSet resultSet = psPreparedStatement.getResultSet()) {
			while (resultSet.next()) {

				Integer cId = resultSet.getInt("c_id");
				String cNome = resultSet.getString("c_nome");
				
				if (ultima == null || !ultima.getNome().equals(cNome)) {
					Categoria categoria = new Categoria(cId, cNome);
					categorias.add(categoria);
					ultima = categoria;
				}
				
				int pId = resultSet.getInt("p_id");
				String pNome = resultSet.getString("p_nome");
				String pDescricao = resultSet.getString("p_descricao");
				
				Produto produto = new Produto(pNome, pDescricao);
				produto.setId(pId);
				ultima.setListaDeProdutos(produto);

				
			

			}
		}
		return categorias;

	}

	/**
	 * @param pstm
	 * @param lista
	 * @throws SQLException
	 */
	private void transformaResultadoEmCategoria(PreparedStatement pstm, List<Categoria> lista) throws SQLException {
		try (ResultSet resultSet = pstm.getResultSet()) {
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				Categoria categoria = new Categoria(id, nome);
				lista.add(categoria);
			}
		}
	}

}
