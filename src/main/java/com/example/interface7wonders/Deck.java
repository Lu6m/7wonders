package com.example.interface7wonders;

import com.example.interface7wonders.Cards.CBlue;
import com.example.interface7wonders.Cards.CBrown;
import com.example.interface7wonders.Cards.CGreen;
import com.example.interface7wonders.Cards.CRed;
import com.example.interface7wonders.Wonders.Wonder;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    public static Deck option;
    private String imageBack;
    public static final ArrayList<Card> listAlexandria = new ArrayList<>() {
        {
            new CBlue(2, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(2, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(1, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(2, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(1, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(2, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(2, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(2, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(2, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(1, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(4, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(1, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(1, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listMystery = new ArrayList<>() {
        {
            new CBlue(8, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(4, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(4, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(4, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(4, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(4, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(4, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(4, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(4, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(4, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(6, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(4, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(4, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(2, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listBabylon = new ArrayList<> (){
        {
            new CBlue(2, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(2, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(2, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(1, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(2, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(2, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(1, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(2, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(2, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(2, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(3, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(1, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(1, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listOlympia = new ArrayList<> (){
        {
            new CBlue(1, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(3, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(1, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(2, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(1, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(1, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(2, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(2, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(2, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(2, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(3, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(2, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(1, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listEphesos = new ArrayList<>() {
        {
            new CBlue(1, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(2, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(2, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(2, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(1, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(2, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(2, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(2, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(2, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(2, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(3, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(1, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(1, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listGizah = new ArrayList<> () {
        {
            new CBlue(3, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(2, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(2, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(1, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(1, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(1, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(2, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(2, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(1, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(2, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(3, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(2, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(0, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listHalikarnassos = new ArrayList<>() {
        {
            new CBlue(2, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(2, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(1, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(2, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(1, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(2, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(2, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(1, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(2, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(2, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(3, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(2, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(1, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };
    public static final ArrayList<Card> listRohdos = new ArrayList<>() {
        {
            new CBlue(2, 2, 0, "Image/card-politic-women-2laurel-cat.png", true);
            new CBlue(2, 3, 0, "Image/card-politic-emperor-3laurel.png", false);
            new CGreen(1, 0, 0, "Image/card-progress-architect.png", "architect");
            new CGreen(1, 0, 0, "Image/card-progress-law.png", "law");
            new CGreen(2, 0, 0, "Image/card-progress-mechanic.png", "mechanic");
            new CBrown(2, 0, 0, "Image/card-material-wood-lumberjack.png", "wood");
            new CBrown(1, 0, 0, "Image/card-material-stone-stonecutter.png", "stone");
            new CBrown(2, 0, 0, "Image/card-material-paper-women.png", "paper");
            new CBrown(2, 0, 0, "Image/card-material-brick-women.png", "brick");
            new CBrown(2, 0, 0, "Image/card-material-glass-women.png", "glass");
            new CBrown(2, 0, 0, "Image/card-material-gold-vizir.png", "gold");
            new CRed(2, 0, 1, "Image/card-war-centurion.png", 0);
            new CRed(2, 0, 1, "Image/card-war-barbarian-1corn.png", 1);
            new CRed(1, 0, 1, "Image/card-war-archer-2corns.png", 2);
        }
    };

    public Deck(String imageBack) {
        this.imageBack = imageBack;
        createDeck(listMystery);
        ListDecksAssocies();
    }

    public ArrayList<Card> createDeck(ArrayList<Card> listeDeck) {
        for (int i = 0; i < 14; i++)
            if (listeDeck.get(i).option.getQuantity() > 1)
                for (int j = 1; j < listeDeck.get(i).option.getQuantity(); j++) listeDeck.add(listeDeck.get(i).clone());
        Collections.shuffle(listeDeck);
        System.out.println("nombre de cartes : "+listeDeck.size());
        return listeDeck;
    }

    public ArrayList<ArrayList> ListDecksAssocies(){
        ArrayList<ArrayList> listDecks = new ArrayList<>(Game.option.getNbPlayers());
        for (int k=0;k<Game.option.getNbPlayers();k++){
            String name= Game.option.getListMerveilles().get(k).getName();
            switch (name) {
                case "Ephèse":
                    listDecks.add(createDeck(listEphesos));
                    break;
                case "Alexandrie":
                    listDecks.add(createDeck(listAlexandria));
                    break;
                case "Babylon":
                    listDecks.add(createDeck(listBabylon));
                    break;
                case "Cizeh":
                    listDecks.add(createDeck(listGizah));
                    break;
                case "Halicarnasse":
                    listDecks.add(createDeck(listHalikarnassos));
                    break;
                case "Olympie":
                    listDecks.add(createDeck(listOlympia));
                    break;
                case "Rhodes":
                    listDecks.add(createDeck(listRohdos));
                    break;
            }
        }
    return listDecks;
    }
}
