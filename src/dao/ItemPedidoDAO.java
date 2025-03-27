package dao;

import model.ItemPedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemPedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirItemPedido (ItemPedido itemPedido){
        try (Connection conn = conexao.conectar();
             PreparedStatement novoItemPedido = conn.prepareStatement("INSERT INTO itenspedidos (quantidade,precoUnitario) VALUES (?,?);")){

            novoItemPedido.setString(1, itemPedido.getQuantidade());
            novoItemPedido.setDouble(2, itemPedido.getPrecoUnitario());

            int rowsAffected =  novoItemPedido.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean atualizarItemPedido (ItemPedido itemPedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement itemPedidoAtualizado = conn.prepareStatement("UPDATE itenspedidos SET quantidade = ?, precoUnitario = ? WHERE idItemPedido = ?;")){

            itemPedidoAtualizado.setString(1, itemPedido.getQuantidade());
            itemPedidoAtualizado.setDouble(2, itemPedido.getPrecoUnitario());


            int rowsAffected = itemPedidoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean deletarItemPedido (int idItemPedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement itemPedidoDeletado = conn.prepareStatement("DELETE FROM itenspedidos WHERE idItemPedido = ?;")){

            itemPedidoDeletado.setInt(1, idItemPedido);


            int rowsAffected = itemPedidoDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}