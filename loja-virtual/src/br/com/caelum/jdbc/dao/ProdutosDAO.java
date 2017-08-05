package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.modelo.Categoria;
import br.com.caelum.jdbc.modelo.Produto;

public class ProdutosDAO {

	private final Connection con;

	/**
	 * @param con
	 */
	public ProdutosDAO(Connection con) {
		this.con = con;
	}

	/**
	 * @param connection
	 * @param produto
	 * @param sql
	 * @throws SQLException
	 */
	public void salva(Produto produto) throws SQLException {

		String sql = "INSERT INTO Produto (nome, descricao) values ( ?, ?)";
		try (PreparedStatement preparedStatement = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			preparedStatement.setString(1, produto.getNome());
			preparedStatement.setString(2, produto.getDescricao());
			preparedStatement.execute();

			try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					produto.setId(id);

				}
			}
		}
	}

	public List<Produto> lista() throws SQLException {
		List<Produto> lista = new ArrayList<>();

		String sql = "SELECT * FROM Produto";
		try (Statement statement = this.con.createStatement()) {
			@SuppressWarnings("unused")
			boolean resposta = statement.execute(sql);

			transformaResultadoEmProduto(lista, statement);
		}
		return lista;

	}

	public List<Produto> buscaPorCategoria(Categoria categoria) throws SQLException {
		List<Produto> listaPorCategoria = new ArrayList<>();
		String sql = "SELECT * FROM Produto WHERE categoria_id = ?";
		try (PreparedStatement pstatement = this.con.prepareStatement(sql)) {
			pstatement.setInt(1, categoria.getId());
			@SuppressWarnings("unused")
			boolean retorno = pstatement.execute();
			transformaResultadoEmProduto(listaPorCategoria, pstatement);
		}
		return listaPorCategoria;

	}

	/**
	 * @param lista
	 * @param statement
	 * @throws SQLException
	 */
	private void transformaResultadoEmProduto(List<Produto> lista, Statement statement) throws SQLException {
		try (ResultSet resultSet = statement.getResultSet()) {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String descricao = resultSet.getString("descricao");

				Produto produto = new Produto(nome, descricao);
				produto.setId(id);
				lista.add(produto);
			}

		}
	}

}
