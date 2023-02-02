package com.example.interface7wonders.Wonders;

import java.util.ArrayList;

public class WonderPiece {
    private int etage;
    private boolean state=false ;
    private String nomMerveille;
    private ArrayList<WonderPiece> listPieceMerv;

    public WonderPiece(String nomMerveille, int etage, boolean state) {
        this.nomMerveille=nomMerveille;
        this.etage = etage;
        this.state = state;
        createlistPieceMerv(WonderFront.option.listAlexandriaF);
        createlistPieceMerv(WonderFront.option.listEpheseF);
        createlistPieceMerv(WonderFront.option.listBabylonF);
        createlistPieceMerv(WonderFront.option.listGizehF);
        createlistPieceMerv(WonderFront.option.listHallicarnasF);
        createlistPieceMerv(WonderFront.option.listRhodesF);
        createlistPieceMerv(WonderFront.option.listOlympieF);

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
