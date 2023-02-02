package com.example.interface7wonders.Wonders;

import com.example.interface7wonders.Game;

import java.util.ArrayList;

public class WonderPiece {
    public static WonderPiece option;
    private int etage;
    private boolean state=false ;
    private String nomMerveille;
    private ArrayList<WonderPiece> listPieceMerv;
    public ArrayList<WonderPiece>listAlex=createlistPieceMerv(WonderFront.option.listAlexandriaF);
    public ArrayList<WonderPiece>listEph=createlistPieceMerv(WonderFront.option.listEpheseF);
    public ArrayList<WonderPiece>listBaby=createlistPieceMerv(WonderFront.option.listBabylonF);
    public ArrayList<WonderPiece>listGiz=createlistPieceMerv(WonderFront.option.listGizehF);
    public ArrayList<WonderPiece>listHali=createlistPieceMerv(WonderFront.option.listHallicarnasF);
    public ArrayList<WonderPiece>listRho=createlistPieceMerv(WonderFront.option.listRhodesF);
    public ArrayList<WonderPiece>listOlym=createlistPieceMerv(WonderFront.option.listOlympieF);

    public WonderPiece(String nomMerveille, int etage, boolean state) {
        this.nomMerveille=nomMerveille;
        this.etage = etage;
        this.state = state;
    }

    public ArrayList<WonderPiece> createlistPieceMerv(ArrayList<WonderPiece> liste) {
        return new ArrayList<WonderPiece>(5){{
                for (int i = 0; i < 5; i++)
                    liste.get(i);
            }};
    }

    public int getEtage() {return etage;}

    public boolean isState() {return state;}
}
