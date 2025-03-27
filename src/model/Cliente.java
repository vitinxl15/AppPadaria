
package model;

public class Cliente {

    private int idCliente;

    private String nome;

    private String cpf;

    private String telefone;

    private String email;

    public Cliente(String nome, String cpf, String telefone, String email) {

        this.nome = nome;

        this.cpf = cpf;

        this.telefone = telefone;

        this.email = email;

    }

    public int getIdCliente() {return idCliente;}

    public void setIdCliente(int idCliente) {this.idCliente = idCliente;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

}

