package dao;
import model.Endereco;
import util.Conexao;

import java.sql.PreparedStatement;
import java.sql.Connection;


public class EnderecoDAO {
    private Conexao conexao = new Conexao();
    public boolean inserirEndereco(Endereco endereco) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoEndereco = conn.prepareStatement("INSERT INTO endereco (cep,logradouro,bairro,cidade,estado,numero) VALUES (?,?,?,?,?,?);")){

            novoEndereco.setString(1, endereco.getCep());
            novoEndereco.setString(2, endereco.getLogradouro());
            novoEndereco.setString(3, endereco.getBairro());
            novoEndereco.setString(4, endereco.getCidade());
            novoEndereco.setString(5, endereco.getEstado());
            novoEndereco.setString(6, endereco.getNumero());

            int rowsAffected =  novoEndereco.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean atualizarEndereco(Endereco endereco) {
        try(Connection conn = conexao.conectar();
            PreparedStatement enderecoAtualizado = conn.prepareStatement("UPDATE endereco SET cep = ?, logradouro = ?, bairro = ?, cidade = ?, estado = ?, numero = ? WHERE idEndereco = ?;")){

            enderecoAtualizado.setString(1, endereco.getCep());
            enderecoAtualizado.setString(2, endereco.getLogradouro());
            enderecoAtualizado.setString(3, endereco.getBairro());
            enderecoAtualizado.setString(4, endereco.getCidade());
            enderecoAtualizado.setString(5, endereco.getEstado());
            enderecoAtualizado.setString(6, endereco.getNumero());

            int rowsAffected = enderecoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean deletarEndereco(int idEndereco) {
        try(Connection conn = conexao.conectar();
            PreparedStatement enderecoDeletado = conn.prepareStatement("DELETE FROM endereco WHERE idEndereco = ?;")){

            enderecoDeletado.setInt(1, idEndereco);


            int rowsAffected = enderecoDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
