package com.example.interface7wonders;

import com.example.interface7wonders.Cards.CBlue;
import com.example.interface7wonders.Cards.CBrown;
import com.example.interface7wonders.Cards.CGreen;

import java.util.ArrayList;
import java.util.Collections;

public class ProgressToken {
    private String effect;
    private int nbPVictoire;
    private String imageFront;

    public static final ArrayList<ProgressToken> listToken = new ArrayList<>() {
        {
            new ProgressToken("", 0, "Image/token-architecture.png");
            new ProgressToken("paper or potion = +1 card", 0, "Image/token-artsAndCrafts.png");
            new ProgressToken("1=4 points", 4, "Image/token-culture.png");
            new ProgressToken("2=12 points", 4, "Image/token-culture.png");
            new ProgressToken("4 points if in construction, 6 otherwise ", 4, "Image/token-decoration.png");
            new ProgressToken("1 yellow card = 2 yellow cards", 0, "Image/token-economy.png");
            new ProgressToken("2 points per progress token", 0, "Image/token-green-token2.png");
            new ProgressToken("don't have to follow the same or different instructions", 0, "Image/token-ingeniery.png");
            new ProgressToken("stone or gold = +1 card", 0, "Image/token-jewelry.png");
            new ProgressToken("1 point per cat", 0, "Image/token-politic.png");
            new ProgressToken("horn = +1 card", 0, "Image/token-propaganda.png");
            new ProgressToken("green card = +1 card", 0, "Image/token-science.png");
            new ProgressToken("1 war token = +1 point", 0, "Image/token-strategy.png");
            new ProgressToken("+2 war points", 0, "Image/token-tactic.png");
            new ProgressToken("wood or brick = +1 card", 0, "Image/token-urbanism.png");
        }
    };

    public ProgressToken(String effect, int nbPVictoire,String imageFront) {
        this.effect = effect;
        this.nbPVictoire = nbPVictoire;
        this.imageFront=imageFront;
        Collections.shuffle(listToken);
    }

    public String getEffect() {
        return effect;
    }

    public int getNbPVictoire() {
        return nbPVictoire;
    }

    public String getImageFront() {
        return imageFront;
    }


}
