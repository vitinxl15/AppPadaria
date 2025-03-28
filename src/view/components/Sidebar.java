package view.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Sidebar extends VBox {

     public Button btnFornecedor = new Button("Fornecedor");
     public Button btnProduto = new Button("Produto");
     public Button btnCliente = new Button("Cliente");
     public Button btnPedido = new Button("Pedido");

    //construtor para inicializar o componentes (como um objeto) em outras janelas
    public Sidebar() {
        Label lblMenu = new Label("Starbucks");
        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);

    }
}
