package model;

public class Pedido {

    private int idPedido;

    private String dataPedido;

    private String statusPedido;
    private int idCliente;

    public Pedido( int idCliente ) {

        this.idCliente = idCliente;

    }

    public int getIdPedido() {return idPedido;}

    public void setIdPedido(int idPedido) {this.idPedido = idPedido;}

    public String getDataPedido() {return dataPedido;}

    public void setDataPedido(String dataPedido) {this.dataPedido = dataPedido;}

    public String getStatusPedido() {return statusPedido;}

    public void setStatusPedido(String statusPedido) {this.statusPedido = statusPedido;}


}

