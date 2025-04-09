package view.components;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class Buttons extends HBox {
    public Button btnAdicionar = new Button("Adicionar");
    public Button btnEditar = new Button("Editar");
    public Button btnExcluir = new Button("Excluir");


    public Buttons(){
        Image imgIconsAdicionar = new Image("/view/resources/img/plus-96px.png");
        Image imgIconsEditar = new Image("/view/resources/img/editar-80px.png");
        Image imgIconsExcluir = new Image("/view/resources/img/delete-90px.png");

        Font fonteNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Bold.ttf"), 14);
       btnAdicionar.setFont(Font.font(fonteNegrito.getFamily(), 14));
       btnEditar.setFont(Font.font(fonteNegrito.getFamily(), 14));
       btnExcluir.setFont(Font.font(fonteNegrito.getFamily(), 14));




        ImageView imgViewIconsAdicionar = new ImageView(imgIconsAdicionar);
        imgViewIconsAdicionar.setFitHeight(26);
        imgViewIconsAdicionar.setFitWidth(26);
        btnAdicionar.setGraphic(imgViewIconsAdicionar);

        ImageView imgViewIconsEditar = new ImageView(imgIconsEditar);
        imgViewIconsEditar.setFitHeight(26);
        imgViewIconsEditar.setFitWidth(26);
        btnEditar.setGraphic(imgViewIconsEditar);

        ImageView imgViewIconsExcluir = new ImageView(imgIconsExcluir);
        imgViewIconsExcluir.setFitHeight(26);
        imgViewIconsExcluir.setFitWidth(26);
        btnExcluir.setGraphic(imgViewIconsExcluir);


        String styleButtons ="-fx-background-color: transparent;" +
                "-fx-border-color: transparent;"+
                "-fx-text-fill: black;" +
                "-fx-alignment: center;"+
                "-fx-cursor: hand;";


        btnAdicionar.setStyle(styleButtons);
        btnEditar.setStyle(styleButtons);
        btnExcluir.setStyle(styleButtons);

        btnAdicionar.setOnMouseEntered(evento -> btnAdicionar.setStyle(styleButtons.replace("transparent", "#58b558")));
        btnAdicionar.setOnMouseExited(evento -> btnAdicionar.setStyle(styleButtons.replace("#58b558", "transparent")));

        btnEditar.setOnMouseEntered(evento -> btnEditar.setStyle(styleButtons.replace("transparent", "#58b558")));
        btnEditar.setOnMouseExited(evento -> btnEditar.setStyle(styleButtons.replace("#58b558", "transparent")));

        btnExcluir.setOnMouseEntered(evento -> btnExcluir.setStyle(styleButtons.replace("transparent", "#58b558")));
        btnExcluir.setOnMouseExited(evento -> btnExcluir.setStyle(styleButtons.replace("#58b558", "transparent")));

        getChildren().addAll( btnAdicionar, btnEditar, btnExcluir);

    }
}
