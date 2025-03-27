package dao;

import model.Produto;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirProduto(Produto produto) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoProduto = conn.prepareStatement("INSERT INTO produtos (nome,preco) VALUES (?,?);")){

            novoProduto.setString(1, produto.getNome());
            novoProduto.setDouble(2, produto.getPreco());


            int rowsAffected =  novoProduto.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean atualizarProduto(Produto produto) {
        try(Connection conn = conexao.conectar();
            PreparedStatement ProdutoAtualizado = conn.prepareStatement("UPDATE produtos SET nome = ?, preco = ? WHERE idProduto = ?;")){

            ProdutoAtualizado.setString(1, produto.getNome());
            ProdutoAtualizado.setDouble(2, produto.getPreco());


            int rowsAffected = ProdutoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean deletarProduto(int idProduto) {
        try(Connection conn = conexao.conectar();
            PreparedStatement ProdutoDeletado = conn.prepareStatement("DELETE FROM produtos WHERE idProduto = ?;")){

            ProdutoDeletado.setInt(1, idProduto);


            int rowsAffected = ProdutoDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}