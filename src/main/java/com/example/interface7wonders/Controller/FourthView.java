package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Deck;
import com.example.interface7wonders.Game;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class FourthView {
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
    private AnchorPane afficheJeu6;
    @FXML
    private AnchorPane afficheJeu7;
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
    private Text pickText;
    @FXML
    private Text numPlayerPrincipal;;
    @FXML
    private Text nbPointsVictoirePrincipal;
    @FXML
    private ImageView token1;
    @FXML
    private ImageView token2;
    @FXML
    private ImageView token3;
    @FXML
    private ImageView token4;
    @FXML
    private ImageView token5;
    @FXML
    private ImageView token6;
    @FXML
    private Text nbPointsVictoire1;
    @FXML
    private Text numPlayer1;
    @FXML
    private ImageView tokenSide11;
    @FXML
    private ImageView tokenSide12;
    @FXML
    private ImageView tokenSide13;
    @FXML
    private ImageView tokenSide14;
    @FXML
    private Text nbPointsVictoire2;
    @FXML
    private Text numPlayer2;
    @FXML
    private Text nbPointsVictoire3;
    @FXML
    private Text numPlayer4;
    @FXML
    private Button finishedButton;

    public void start(){
        Deck.option.getListeDeck("Images/card-back-question.png");
        Deck.option.getListeDeck("Images/card-back-alexandrie.png");
        Deck.option.getListeDeck("Images/card-back-babylon.png");
    }
    @FXML
    protected void onFinishedClick() throws IOException {
        double layX = afficheJeu1.getLayoutX();
        double layY = afficheJeu1.getLayoutY();
        for (int i = 1; i == Game.getNbPlayers(); i++) {
            String anchor = "afficheJeu" + i + "";
            System.out.println(anchor);

            //anchor.setLayoutX(afficheJeu2.getLayoutX());
            //anchor.setLayoutY(afficheJeu2.getLayoutY());

            afficheJeu7.setLayoutX(layX);
            afficheJeu7.setLayoutY(layY);
        }
    }
}
