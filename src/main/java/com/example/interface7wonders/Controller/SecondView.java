package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Game;
import com.example.interface7wonders.HelloApplication;
import com.example.interface7wonders.Wonder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondView {
    ObservableList<String> nbPlayerList= FXCollections.observableArrayList("2","3","4","5","6","7");
    @FXML
    private ChoiceBox nbPlayerBox;
    @FXML
    private void initialize(){
        nbPlayerBox.setItems(nbPlayerList);

    }
    @FXML
    private Text needPlayerText;

    @FXML
    protected void onOkClick() throws IOException {
        try{
            Game.option.setNbPlayers(Integer.parseInt((String) nbPlayerBox.getSelectionModel().getSelectedItem()));
            System.out.println(Game.getNbPlayers());
            Stage stage = (Stage) needPlayerText.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("third-view.fxml"));
            stage.setScene(new Scene(fxmlLoader.load()));
        } catch (NumberFormatException e) {
            needPlayerText.setText("Veuillez sélectionner un chiffre");

        }
    }
}
