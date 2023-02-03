package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Deck;
import com.example.interface7wonders.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class SixthView {
    @FXML
    private AnchorPane afficheJeu1;
    @FXML
    private AnchorPane afficheJeu2;
    @FXML
    private AnchorPane afficheJeu3;
    @FXML
    private AnchorPane afficheJeu4;
    @FXML
    private AnchorPane afficheJeu5;


    @FXML
    protected void onFinishedClick() throws IOException {
        double layX = afficheJeu1.getLayoutX();
        double layY = afficheJeu1.getLayoutY();
        afficheJeu1.setLayoutX(afficheJeu2.getLayoutX());
        afficheJeu1.setLayoutY(afficheJeu2.getLayoutY());
        afficheJeu2.setLayoutX(afficheJeu3.getLayoutX());
        afficheJeu2.setLayoutY(afficheJeu3.getLayoutY());
        afficheJeu3.setLayoutX(afficheJeu4.getLayoutX());
        afficheJeu3.setLayoutY(afficheJeu4.getLayoutY());
        afficheJeu4.setLayoutX(afficheJeu5.getLayoutX());
        afficheJeu4.setLayoutY(afficheJeu5.getLayoutY());
        afficheJeu5.setLayoutX(layX);
        afficheJeu5.setLayoutY(layY);
    }
}

