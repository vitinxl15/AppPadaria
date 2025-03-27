package model;

public class ItemPedido {

    private int idItemPedido;

    private String quantidade;

    private double precoUnitario;

    public ItemPedido(String quantidade, double precoUnitario) {

        this.quantidade = quantidade;

        this.precoUnitario = precoUnitario;

    }

    public int getIdItemPedido() {return idItemPedido;}

    public void setIdItemPedido(int idItemPedido) {this.idItemPedido = idItemPedido;}

    public String getQuantidade() {return quantidade;}

    public void setQuantidade(String quantidade) {this.quantidade = quantidade;}

    public double getPrecoUnitario() {return precoUnitario;}

    public void setPrecoUnitario(double precoUnitario) {this.precoUnitario = precoUnitario;}

}

