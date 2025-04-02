package view.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Sidebar extends VBox {

     public Button btnFornecedor = new Button("Fornecedor");
     public Button btnProduto = new Button("Produto");
     public Button btnCliente = new Button("Cliente");
     public Button btnPedido = new Button("Pedido");


    //construtor para inicializar o componentes (como um objeto) em outras janelas
    public Sidebar() {
        Image imgIconFornecedor = new Image(getClass().getResourceAsStream("/view/img/fornecedor-40px.png"));
        Image  imgIconProduto = new Image(getClass().getResourceAsStream("/view/img/Produto-40px.png"));
        Image  imgIconCliente = new Image(getClass().getResourceAsStream("/view/img/cliente-40px.png"));
        Image  imgIconPedido = new Image(getClass().getResourceAsStream("/view/img/Pedido-48px.png"));

        //determina como as imagens serao vizualizada
        ImageView imgViewIconFornecedor = new ImageView(imgIconFornecedor);
        imgViewIconFornecedor.setFitHeight(20);//altura
        imgViewIconFornecedor.setFitWidth(20);//largura
        btnFornecedor.setGraphic(imgViewIconFornecedor);

        ImageView imgViewProduto = new ImageView(imgIconProduto);
        imgViewProduto.setFitHeight(20);
        imgViewProduto.setFitWidth(20);
        btnProduto.setGraphic(imgViewProduto);

        ImageView imgViewCliente = new ImageView(imgIconCliente);
        imgViewCliente.setFitHeight(20);
        imgViewCliente.setFitWidth(20);
        btnCliente.setGraphic(imgViewCliente);

        ImageView imgViewPedido = new ImageView(imgIconPedido);
        imgViewPedido.setFitHeight(20);
        imgViewPedido.setFitWidth(20);
        btnPedido.setGraphic(imgViewPedido);

        String styleButton = "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;"+
                "-fx-font-size: 14px;"+
                "-fx-font-weigth: bold;"+
                "-fx-text-fill: black;" +
                "-fx-alignment: center;"+
                "-fx-graphic-text-gap: 10px";

        btnFornecedor.setStyle(styleButton);
        btnProduto.setStyle(styleButton);
        btnCliente.setStyle(styleButton);
        btnPedido.setStyle(styleButton);

        Label lblMenu = new Label("Starbucks");
        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");



        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);

    }
}
