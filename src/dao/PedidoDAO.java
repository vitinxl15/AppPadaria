package dao;

import model.Pedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirPedido(Pedido pedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoPedido = conn.prepareStatement("INSERT INTO pedidos (dataPedido,statusPedido) VALUES (?,?);")){

            novoPedido.setString(1, pedido.getDataPedido());
            novoPedido.setString(2, pedido.getStatusPedido());


            int rowsAffected =  novoPedido.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean atualizarPedido(Pedido pedido) {
        try(Connection conn = conexao.conectar();
            PreparedStatement PedidoAtualizado = conn.prepareStatement("UPDATE pedidos SET dataPedido = ?, statusPedido = ? WHERE idPedido = ?;")){

            PedidoAtualizado.setString(1, pedido.getDataPedido());
            PedidoAtualizado.setString(2, pedido.getStatusPedido());



            int rowsAffected = PedidoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean deletarPedido(int idPedido){
        try(Connection conn = conexao.conectar();
            PreparedStatement PedidoDeletado = conn.prepareStatement("DELETE FROM pedidos WHERE idPedido = ?;")){

            PedidoDeletado.setInt(1, idPedido);


            int rowsAffected = PedidoDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}