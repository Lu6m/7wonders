package com.example.interface7wonders;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {

    /* ******/
    public static Game option;
    public static void playGame() {
        Game.option = new Game();
    }
    /* ******/


    private static int nbPlayers;
    private ArrayList listMerveilles = new ArrayList<>();



    public void setNbPlayers(int nbPlayers) {
        this.nbPlayers = nbPlayers;
    }
    public static int getNbPlayers() {
        return nbPlayers;
    }


    public void createListeMerveilles(){
        this.listMerveilles.add(new Merveilles("Ephèse","Images/deck-ephese.png"));
        this.listMerveilles.add(new Merveilles("Alexandrie","Images/deck-alexandrie.png"));
        this.listMerveilles.add(new Merveilles("Babylon","Images/deck-babylon.png"));
        this.listMerveilles.add(new Merveilles("Cizeh","Images/deck-cizeh.png"));
        this.listMerveilles.add(new Merveilles("Halicarnasse","Images/deck-halicarnasse.png"));
        this.listMerveilles.add(new Merveilles("Olympie","Images/deck-olympie.png"));
        this.listMerveilles.add(new Merveilles("Rhodes","Images/deck-rhodes.png"));
        Collections.shuffle(this.listMerveilles);

        }

    public ArrayList<Merveilles> getListMerveilles() {
        return this.listMerveilles;
    }
}