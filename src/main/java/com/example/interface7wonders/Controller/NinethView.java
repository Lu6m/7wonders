package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Card;
import com.example.interface7wonders.Deck;
import com.example.interface7wonders.Game;
import com.example.interface7wonders.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class NinethView {
    @FXML
    private AnchorPane afficheJeu1;
    @FXML
    private AnchorPane afficheJeu2;

    /* --------------- Jeu général--------------- */
    @FXML
    private Text playersTurn;
    @FXML
    private ImageView tokenPioche;
    @FXML
    private ImageView tokenPick1;
    @FXML
    private ImageView tokenPick2;
    @FXML
    private ImageView tokenPick3;
    @FXML
    private ImageView mysteryDeck;
    @FXML
    private ImageView leftDeck;
    @FXML
    private ImageView rightDeck;
    @FXML
    private ImageView tokenWar1;
    @FXML
    private ImageView tokenWar2;
    @FXML
    private ImageView tokenWar3;
    @FXML
    private ImageView tokenWar4;
    @FXML
    private ImageView tokenWar5;
    @FXML
    private ImageView tokenWar6;
    @FXML
    private Button finishedButton;
    @FXML
    private Button okButton;


    /* --------------- AfficheJeu1 --------------- */
    @FXML
    private Text nbPointsVictoire1;
    @FXML
    private Text nbPointsWar1;
    @FXML
    private Text playerText1;
    @FXML
    private ImageView token11;
    @FXML
    private ImageView token12;
    @FXML
    private ImageView token13;
    @FXML
    private ImageView token14;
    @FXML
    private ImageView token15;
    @FXML
    private ImageView token16;
    @FXML
    private ImageView carte11;
    @FXML
    private ImageView carte12;
    @FXML
    private ImageView carte13;
    @FXML
    private ImageView carte14;
    @FXML
    private ImageView carte15;
    @FXML
    private ImageView carte16;
    @FXML
    private ImageView carte17;
    @FXML
    private ImageView carte18;
    @FXML
    private ImageView carte19;
    @FXML
    private ImageView carte110;
    @FXML
    private ImageView carte111;
    @FXML
    private ImageView carte112;

    /* --------------- AfficheJeu2 --------------- */
    @FXML
    private Text nbPointsVictoire2;
    @FXML
    private Text nbPointsWar2;
    @FXML
    private Text playerText2;
    @FXML
    private ImageView token21;
    @FXML
    private ImageView token22;
    @FXML
    private ImageView token23;
    @FXML
    private ImageView token24;
    @FXML
    private ImageView token25;
    @FXML
    private ImageView token26;
    @FXML
    private ImageView carte21;
    @FXML
    private ImageView carte22;
    @FXML
    private ImageView carte23;
    @FXML
    private ImageView carte24;
    @FXML
    private ImageView carte25;
    @FXML
    private ImageView carte26;
    @FXML
    private ImageView carte27;
    @FXML
    private ImageView carte28;
    @FXML
    private ImageView carte29;
    @FXML
    private ImageView carte210;
    @FXML
    private ImageView carte211;
    @FXML
    private ImageView carte212;
    private int u = 0;


    public void initialize() {
        Player p = ThirdView.option.getListPlayers().get(0);
        playerText1.setText(p.option.getname());

        mysteryDeck.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            Card carte = (Card) Deck.option.getListeDeck("Image/card-back-question.png").get(u);
            mysteryDeck.setImage(carte);
            u++;

            event.consume();
        });
    }


    @FXML
    protected void onFinishedClick() throws IOException {
        double layX = afficheJeu1.getLayoutX();
        double layY = afficheJeu1.getLayoutY();
        afficheJeu1.setLayoutX(afficheJeu2.getLayoutX());
        afficheJeu1.setLayoutY(afficheJeu2.getLayoutY());
        afficheJeu2.setLayoutX(layX);
        afficheJeu2.setLayoutY(layY);
        playersTurn.setText(Player.option.getName()+"'s turn");
    }

    public void onOkClick() {
    }
}