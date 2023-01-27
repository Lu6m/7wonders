package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Deck;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class EighthView {
    @FXML
    private AnchorPane afficheJeu1;
    @FXML
    private AnchorPane afficheJeu2;
    @FXML
    private AnchorPane afficheJeu3;


    public void start() {
        Deck.option.getListeDeck("Images/card-back-question.png");
        Deck.option.getListeDeck("Images/card-back-alexandrie.png");
        Deck.option.getListeDeck("Images/card-back-babylon.png");
    }

    @FXML
    protected void onFinishedClick() throws IOException {
        double layX = afficheJeu1.getLayoutX();
        double layY = afficheJeu1.getLayoutY();
        afficheJeu1.setLayoutX(afficheJeu2.getLayoutX());
        afficheJeu1.setLayoutY(afficheJeu2.getLayoutY());
        afficheJeu2.setLayoutX(afficheJeu3.getLayoutX());
        afficheJeu2.setLayoutY(afficheJeu3.getLayoutY());
        afficheJeu3.setLayoutX(layX);
        afficheJeu3.setLayoutY(layY);
    }

    public void onOkClick(ActionEvent actionEvent) {
    }
}
