package com.example.interface7wonders;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.Objects;

public abstract class Card {
    public static Card option;
    private int quantity;
    private int nbPVictoire;
    private String imageFront;
    private int nbPWar;

    public Card(int quantity, int nbPVictoire, int nbPWar, String imageFront) {
        this.quantity = quantity;
        this.nbPVictoire = nbPVictoire;
        this.imageFront = imageFront;
        this.nbPWar=nbPWar;
    }

    public String getImageFront() {return imageFront;}

    public int getQuantity() {return quantity;}

    public int getNbPVictoire() {return nbPVictoire;}

    public int getNbPWar() {return nbPWar;}

    public abstract Card clone();

    public static void affiche(String path, ImageView imageViewName){
        try{
            Image image=new Image(Objects.requireNonNull(Card.class.
                    getResource(path)).openStream());
            imageViewName.setImage(image);}
        catch (IOException | NullPointerException | IllegalArgumentException ignored){}
    }
}
