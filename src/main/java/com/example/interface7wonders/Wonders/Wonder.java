package com.example.interface7wonders.Wonders;

import com.example.interface7wonders.Game;

import java.util.ArrayList;

public class Wonder {
    private String name;
    private String image;
    private ArrayList<ArrayList<WonderPiece>> listPieceMerveilles;

    public Wonder(String name, String image) {
        this.name = name;
        this.image = image;
    }
    public ArrayList<ArrayList<WonderPiece>> createlistPieces (){
        for (int k=0;k<Game.option.getNbPlayers();k++) {
            String name = Game.option.getListMerveilles().get(k).getName();
            switch (name) {
                case "Ephèse":
                    listPieceMerveilles.add(WonderPiece.option.listEph);
                    break;
                case "Alexandrie":
                    listPieceMerveilles.add(WonderPiece.option.listAlex);
                    break;
                case "Babylon":
                    listPieceMerveilles.add(WonderPiece.option.listBaby);
                    break;
                case "Gizeh":
                    listPieceMerveilles.add(WonderPiece.option.listGiz);
                    break;
                case "Halicarnasse":
                    listPieceMerveilles.add(WonderPiece.option.listHali);
                    break;
                case "Olympie":
                    listPieceMerveilles.add(WonderPiece.option.listOlym);
                    break;
                case "Rhodes":
                    listPieceMerveilles.add(WonderPiece.option.listRho);
                    break;
            }
        }
        return listPieceMerveilles;
    }
}
