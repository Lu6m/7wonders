package com.example.interface7wonders.Wonders;

import com.example.interface7wonders.Game;

import java.util.ArrayList;

public class Wonder {
    private String name;
    private String image;
    private ArrayList<Wonder> listPieceMerveilles;

    public Wonder(String name, String image) {
        this.name = name;
        this.image = image;
    }
    public ArrayList<ArrayList> createlistPieces (){
    for (int k=0;k<Game.option.getNbPlayers();k++){
        String name= Game.option.getListMerveilles().get(k).getName();
        switch (name) {
            case "Ephèse":
                listPieceMerveilles.add(WonderFront.listOlympie));
                break;
            case "Alexandrie":
                listPieceMerveilles.add(createDeck(listAlexandria));
                break;
            case "Babylon":
                listPieceMerveilles.add(createDeck(listBabylon));
                break;
            case "Gizeh":
                listPieceMerveilles.add(createDeck(listGizah));
                break;
            case "Halicarnasse":
                listPieceMerveilles.add(createDeck(listHalikarnassos));
                break;
            case "Olympie":
                listPieceMerveilles.add(createDeck(listOlympia));
                break;
            case "Rhodes":
                listPieceMerveilles.add(createDeck(listRohdos));
                break;
        }
    public String getName() {
        return name;
    }

    public String getImage() {
        return this.image;
    }

}
