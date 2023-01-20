package com.example.interface7wonders.Controller;


import com.example.interface7wonders.Game;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloController {
    @FXML
    public void initialize(){
        Game.playGame();
        Game.option.createListeMerveilles();}
    @FXML
    private Button playButton;
    @FXML
    private Text emptyText;
    @FXML
    private Text emptyText2;

    @FXML
    protected void onPlayButtonClick() throws IOException {
        emptyText.setText("Welcome to 7 Wonders Architect!");
        emptyText2.setText("Made by G9's : Laura Houndji, Noémie Mbongo, Lucie Moreau");
        /*Timeline timeline = new Timeline();
        timeline.setDelay(Duration.millis(5000));*/
        Stage stage = (Stage) playButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("second-view.fxml"));
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.setFullScreen(true);
    }
}