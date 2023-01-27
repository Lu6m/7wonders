package com.example.interface7wonders;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.LinkedList;

public class Deck {
    public static Deck option;
    private ArrayList listeDeck;
    private String imageBack;

    public Deck(ArrayList listeDeck, String imageBack) {
        this.listeDeck = listeDeck;
        this.imageBack=imageBack;
    }

    public ArrayList getListeDeck(String imageBack) {
        createDeck(imageBack);
        return listeDeck;
    }

    public void createDeck(String imageBack){
        listeDeck.add(new Card("Image/card-material-wood-lumberjack.png"));
        listeDeck.add(new Card("Image/card-material-brick-women.png"));
        listeDeck.add(new Card("Image/card-material-glass-women.png"));
        listeDeck.add(new Card("Image/card-material-paper-women.png"));

    }
}
