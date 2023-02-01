package com.example.interface7wonders.Cards;

import com.example.interface7wonders.Card;

public class CGreen extends Card {
    private String typeMateriel;

    public CGreen(int quantity, int nbPVictoire, int nbPWar, String imageFront, String typeMateriel) {
        super(quantity, nbPVictoire, nbPWar, imageFront);
        this.typeMateriel = typeMateriel;
    }
    @Override
    public Card clone(){
        return new CGreen(this.getQuantity(), this.getNbPVictoire(), this.getNbPWar(), this.getImageFront(),this.typeMateriel);
    }
}
