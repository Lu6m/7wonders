package com.example.interface7wonders;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    public static Deck option;
    private String name;
    private ArrayList listeDeck;

    public Deck(String name, ArrayList listeDeck) {
        this.name = name;
        this.listeDeck = listeDeck;
    }

    public ArrayList getListeDeck(String imageBack) {
        createDeck(imageBack);
        return listeDeck;
    }

    public void createDeck(String imageBack){
        listeDeck.add(new Card("card-material-wood-lumberjack.png",imageBack));
        listeDeck.add(new Card("card-material-brick-women.png",imageBack));
        listeDeck.add(new Card("card-material-glass-women.png",imageBack));
        listeDeck.add(new Card("card-material-paper-women.png",imageBack));

    }
}
