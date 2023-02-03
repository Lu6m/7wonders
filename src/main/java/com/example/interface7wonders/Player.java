package com.example.interface7wonders;

import com.example.interface7wonders.Wonders.Wonder;

import java.util.LinkedList;

public class Player {
    public static Player option;
    private String name;
    private Wonder saMerveille;
    private int nbPointsVictoire=0;
    private int nbPWarVictory=0;
    private LinkedList<ProgressToken> listToken;
    private LinkedList<Card> listCards;

    public Player(String name, Wonder saMerveille, int nbPointsVictoire, int nbPWarVictory, LinkedList<ProgressToken> listToken, LinkedList<Card> listCards) {
        this.name = name;
        this.saMerveille = saMerveille;
        this.nbPointsVictoire = nbPointsVictoire;
        this.nbPWarVictory = nbPWarVictory;
        this.listToken = listToken;
        this.listCards = listCards;
    }

    public String getName() {
        return name;
    }

    public Wonder getSaMerveille() {
        return saMerveille;
    }
 }
