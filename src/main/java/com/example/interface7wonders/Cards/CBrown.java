package com.example.interface7wonders.Cards;

import com.example.interface7wonders.Card;

public class CBrown extends Card {
    private String typeMateriel;

    public CBrown(int quantity, int nbPVictoire, int nbPWar, String imageFront, String typeMateriel) {
        super(quantity, nbPVictoire, nbPWar, imageFront);
        this.typeMateriel = typeMateriel;
    }
    @Override
    public Card clone(){
        return new CBrown(this.getQuantity(), this.getNbPVictoire(), this.getNbPWar(), this.getImageFront(),this.typeMateriel);
    }
}
