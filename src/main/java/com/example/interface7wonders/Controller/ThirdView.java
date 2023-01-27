package com.example.interface7wonders.Controller;

import com.example.interface7wonders.Game;
import com.example.interface7wonders.HelloApplication;
import com.example.interface7wonders.Wonder;
import com.example.interface7wonders.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.LinkedList;

public class ThirdView {
    public static ThirdView option;
    @FXML
    private AnchorPane canva3bis;
    @FXML
    private Text playerText;
    @FXML
    private Text nameText;
    @FXML
    private TextField nameField;
    @FXML
    private ImageView imageWonder;
    private int j=0;
    private LinkedList<Player> listPlayers=new LinkedList<>();
    public LinkedList<Player> getListPlayers() {
        return listPlayers;
    }

    private String toString(int i) {
        return (i+"");
    }

    public void initialize(){
        Wonder randomMerv=Game.option.getListMerveilles().get(1);
        String path =randomMerv.getImage();
        HelloApplication.BildAnzeigen(path,imageWonder);}
    @FXML
    protected void onOkButton2Click() throws IOException {
        if (j != Game.getNbPlayers()-1) {
            playerText.setText("Player " + toString(j + 2));
            if (nameField.getText() instanceof String){
                Player player=new Player(nameField.getText(),Game.option.getListMerveilles().get(j));
                listPlayers.add(player);
                System.out.println(listPlayers);
                nameField.clear();
                Wonder randomMerv=Game.option.getListMerveilles().get(j);
                String path =randomMerv.getImage();
                HelloApplication.BildAnzeigen(path,imageWonder);
                j++;
            } else{
                nameText.setText("Veuillez rentrer un nom de joueur");
            }
        }else {
            Stage stage = (Stage) playerText.getScene().getWindow();
            switch (Game.getNbPlayers()){
                case 2 : FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("ninth-view.fxml"));
                    stage.setScene(new Scene(fxmlLoader2.load()));
                    stage.setFullScreen(true);
                    break;
                case 3 : FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("eighth-view.fxml"));
                    stage.setScene(new Scene(fxmlLoader3.load()));
                    stage.setFullScreen(true);
                    break;
                case 4 : FXMLLoader fxmlLoader4 = new FXMLLoader(getClass().getResource("seventh-view.fxml"));
                    stage.setScene(new Scene(fxmlLoader4.load()));
                    stage.setFullScreen(true);
                    break;
                case 5 : FXMLLoader fxmlLoader5 = new FXMLLoader(getClass().getResource("sixth-view.fxml"));
                    stage.setScene(new Scene(fxmlLoader5.load()));
                    stage.setFullScreen(true);
                    break;
                case 6 : FXMLLoader fxmlLoader6 = new FXMLLoader(getClass().getResource("fifth-view.fxml"));
                    stage.setScene(new Scene(fxmlLoader6.load()));
                    stage.setFullScreen(true);
                    break;
                case 7 : FXMLLoader fxmlLoader7 = new FXMLLoader(getClass().getResource("fourth-view.fxml"));
                    stage.setScene(new Scene(fxmlLoader7.load()));
                    stage.setFullScreen(true);
                    break;
            }
        }
    }
}

