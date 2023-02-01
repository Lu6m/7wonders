package com.example.interface7wonders.Cards;
import com.example.interface7wonders.Card;

public class CBlue extends Card {
    private boolean chat;

    public CBlue(int quantity, int nbPVictoire, int nbPWar, String imageFront, boolean chat) {
        super(quantity, nbPVictoire, nbPWar, imageFront);
        this.chat = chat;
    }
    @Override
    public Card clone(){
        return new CBlue(this.getQuantity(), this.getNbPVictoire(), this.getNbPWar(), this.getImageFront(), this.chat);
    }
}
