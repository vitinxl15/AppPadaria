package model;

public class Endereco {

    private int idEndereco;

    private String cep;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String estado;

    private String numero;

    public Endereco(String cep, String logradouro, String bairro, String cidade, String estado, String numero) {

        this.cep = cep;

        this.logradouro = logradouro;

        this.bairro = bairro;

        this.cidade = cidade;

        this.estado = estado;

        this.numero = numero;

    }

    public int getIdEndereco(){return idEndereco;}

    public void setIdEndereco(int idEndereco) {this.idEndereco = idEndereco;}

    public String getCep(){return cep;}

    public void setCep(String cep){this.cep = cep;}

    public String getLogradouro(){return logradouro;}

    public void setLogradouro(String logradouro){this.logradouro = logradouro;}

    public String getBairro(){return bairro;}

    public void setBairro(String bairro){this.bairro = bairro;}

    public String getCidade(){return cidade;}

    public void setCidade(String cidade){this.cidade = cidade;}

    public String getEstado(){return estado;}

    public void setEstado(String estado){this.estado = estado;}

    public String getNumero(){return numero;}

    public void setNumero(String numero){this.numero = numero;}

}
