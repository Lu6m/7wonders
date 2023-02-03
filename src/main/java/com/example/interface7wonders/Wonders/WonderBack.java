package com.example.interface7wonders.Wonders;

import java.util.ArrayList;

public class WonderBack extends WonderPiece{
    private int nbRessources;
    private boolean different;
    private String image;

    public ArrayList<WonderPiece> listAlexandriaB = new ArrayList<>(5){{
        new WonderBack("Alexandrie",1,false,2, true,"");
        new WonderBack("Alexandrie",2,false,2, false,"");
        new WonderBack("Alexandrie",3,false,3, true,"");
        new WonderBack("Alexandrie",4,false,3, false,"");
        new WonderBack("Alexandrie",5,false,4, true,"");
    }};
    public ArrayList<WonderPiece> listEpheseB = new ArrayList<>(5){{
        new WonderBack("Ephèse",1,false,2,true,"");
        new WonderBack("Ephèse",2,false,2,false,"");
        new WonderBack("Ephèse",3,false,3,true,"");
        new WonderBack("Ephèse",4,false,3,false,"");
        new WonderBack("Ephèse",5,false,4,true,"");
    }};
    public ArrayList<WonderPiece> listBabylonB = new ArrayList<>(5){{
        new WonderBack("Babylon",1,false,2,true,"");
        new WonderBack("Babylon",2,false,2,false,"");
        new WonderBack("Babylon",3,false,3,true,"");
        new WonderBack("Babylon",4,false,3,false,"");
        new WonderBack("Babylon",5,false,4,true,"");
    }};
    public ArrayList<WonderPiece> listGizehB = new ArrayList<>(5){{
        new WonderBack("Gizeh",1,false,2,true,"");
        new WonderBack("Gizeh",2,false,2,false,"");
        new WonderBack("Gizeh",3,false,3,true,"");
        new WonderBack("Gizeh",4,false,3,false,"");
        new WonderBack("Gizeh",5,false,4,true,"");
    }};
    public ArrayList<WonderPiece> listHallicarnasB = new ArrayList<>(5){{
        new WonderBack("Halicarnasse",1,false,2,true,"");
        new WonderBack("Halicarnasse",2,false,2,false,"");
        new WonderBack("Halicarnasse",3,false,3,true,"");
        new WonderBack("Halicarnasse",4,false,3,false,"");
        new WonderBack("Halicarnasse",5,false,4,true,"");
    }};
    public ArrayList<WonderPiece> listRhodesB = new ArrayList<>(5){{
        new WonderBack("Rhodes",1,false,2,true,"");
        new WonderBack("Rhodes",2,false,2,false,"");
        new WonderBack("Rhodes",3,false,3,true,"");
        new WonderBack("Rhodes",4,false,3,false,"");
        new WonderBack("Rhodes",5,false,4,true,"");
    }};
    public ArrayList<WonderPiece> listOlympieB = new ArrayList<>(5){{
        new WonderBack("Olympie",1,false,2,true,"");
        new WonderBack("Olympie",2,false,2,false,"");
        new WonderBack("Olympie",3,false,3,true,"");
        new WonderBack("Olympie",4,false,3,false,"");
        new WonderBack("Olympie",5,false,4,true,"");
    }};

    public WonderBack(String nomMerveille, int etage, boolean state, int nbRessources, boolean different,String image) {
        super(nomMerveille, etage, state);
        this.nbRessources = nbRessources;
        this.different = different;
        this.image=image;
    }
}
