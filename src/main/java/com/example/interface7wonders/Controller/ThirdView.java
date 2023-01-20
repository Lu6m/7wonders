package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Game;
import com.example.interface7wonders.HelloApplication;
import com.example.interface7wonders.Merveilles;
import com.example.interface7wonders.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class ThirdView {
    @FXML
    private Text playerText;
    @FXML
    private TextField nameField;
    @FXML
    private ImageView imageWonder;
    private int j=0;
    private String toString(int i) {
        return (i+"");
    }

    @FXML
    protected void onOkButton2Click() throws IOException {
        if (j != Game.getNbPlayers()-1) {
            playerText.setText("Player " + toString(j + 2));
            nameField.clear();
            Player player=new Player(nameField.getText(),Game.option.getListMerveilles().get(j));
            Merveilles randomMerv=Game.option.getListMerveilles().get(j);
            String path =randomMerv.getImage();
            HelloApplication.BildAnzeigen(path,imageWonder);
            j++;
        }else {
            Stage stage = (Stage) playerText.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fourth-view.fxml"));
            stage.setScene(new Scene(fxmlLoader.load()));
        }
    }
}

