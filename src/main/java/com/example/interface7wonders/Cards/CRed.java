package com.example.interface7wonders.Cards;

import com.example.interface7wonders.Card;

public class CRed extends Card {
    private int nbCorne;

    public CRed(int quantity, int nbPVictoire, int nbPWar, String imageFront, int nbCorne) {
        super(quantity, nbPVictoire, nbPWar, imageFront);
        this.nbCorne = nbCorne;
    }
    @Override
    public Card clone(){
        return new CRed(this.getQuantity(), this.getNbPVictoire(), this.getNbPWar(), this.getImageFront(),this.nbCorne);
    }
}
