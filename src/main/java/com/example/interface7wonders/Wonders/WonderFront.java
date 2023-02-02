package com.example.interface7wonders.Wonders;

import com.example.interface7wonders.Game;

import java.util.ArrayList;

public class WonderFront extends WonderPiece{
    public static WonderFront option;
    private int pointVictoire;
    private String effet;
    private String image;

    public ArrayList<WonderPiece> listAlexandriaF = new ArrayList<>(5){{
        new WonderFront("Alexandrie",1,true,4, "none","");
        new WonderFront("Alexandrie",2,true,3,"+1 card from anywhere","");
        new WonderFront("Alexandrie",3,true,6,"none","");
        new WonderFront("Alexandrie",4,true,5,"+1 card from anywhere","");
        new WonderFront("Alexandrie",5,true,7,"none","");
    }};
    public ArrayList<WonderPiece> listEpheseF = new ArrayList<>(5){{
        new WonderFront("Ephèse",1,true,3, "none","");
        new WonderFront("Ephèse",2,true,3,"+1 card from mystery","");
        new WonderFront("Ephèse",2,true,4,"+1 card from mystery","");
        new WonderFront("Ephèse",2,true,5,"+1 card from mystery","");
        new WonderFront("Ephèse",3,true,7,"none","");
    }};
    public ArrayList<WonderPiece> listBabylonF = new ArrayList<>(5){{
        new WonderFront("Babylon",1,true,3, "none","");
        new WonderFront("Babylon",2,true,0,"+1 progressToken","");
        new WonderFront("Babylon",3,true,5,"none","");
        new WonderFront("Babylon",4,true,5,"+1 progressToken","");
        new WonderFront("Babylon",4,true,7,"none","");
    }};
    public ArrayList<WonderPiece> listGizehF = new ArrayList<>(5){{
        new WonderFront("Gizeh",1,true,4, "none","");
        new WonderFront("Gizeh",2,true,5,"none","");
        new WonderFront("Gizeh",3,true,6,"none","");
        new WonderFront("Gizeh",4,true,7,"none","");
        new WonderFront("Gizeh",5,true,8,"none","");
    }};
    public ArrayList<WonderPiece> listHallicarnasF = new ArrayList<>(5){{
        new WonderFront("Halicarnasse",1,true,3, "none","");
        new WonderFront("Halicarnasse",2,true,3,"piocher 5 cartes d'un deck et choisir celle qu'on veut","");
        new WonderFront("Halicarnasse",3,true,6,"none","");
        new WonderFront("Halicarnasse",3,true,5,"piocher 5 cartes d'un deck et choisir celle qu'on veut","");
        new WonderFront("Halicarnasse",4,true,7,"none","");
    }};
    public ArrayList<WonderPiece> listRhodesF = new ArrayList<>(5){{
        new WonderFront("Rhodes",1,true,4, "none","");
        new WonderFront("Rhodes",1,true,4,"+1 pt de guerre","");
        new WonderFront("Rhodes",2,true,5,"none","");
        new WonderFront("Rhodes",3,true,6,"+1 pt de guerre","");
        new WonderFront("Rhodes",4,true,7,"none","");
    }};
    public ArrayList<WonderPiece> listOlympieF = new ArrayList<>(5){{
        new WonderFront("Olympie",1,true,3, "none","");
        new WonderFront("Olympie",2,true,2,"+1 card from left or right","");
        new WonderFront("Olympie",2,true,5,"none","");
        new WonderFront("Olympie",3,true,5,"+1 card from left or right","");
        new WonderFront("Olympie",4,true,7,"none","");
    }};

    public WonderFront(String nomMerveille, int etage, boolean state, int pointVictoire, String effet, String image) {
        super(nomMerveille, etage, state);
        this.pointVictoire = pointVictoire;
        this.effet = effet;
        this.image=image;
    }

    public String getEffet() {return effet;}

    public int getPointVictoire() {return pointVictoire;}
}
