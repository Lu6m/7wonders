package com.example.interface7wonders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 455,586);
        stage.setTitle("7 wonders architect");
        stage.setScene(scene);
        stage.show();
    }


    public static void BildAnzeigen(String path, ImageView imageViewName){
            try{Image image=new Image(Objects.requireNonNull(HelloApplication.class.
                    getResource(path)).openStream());
                imageViewName.setImage(image);}
            catch (IOException | NullPointerException | IllegalArgumentException ignored){}
    }

    public static void main(String[] args) {
          launch();}
    }




