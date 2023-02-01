package com.example.interface7wonders;

public abstract class Card {
    public static Card option;
    private int quantity;
    private int nbPVictoire;
    private String imageFront;
    private int nbPWar;

    public Card(int quantity, int nbPVictoire, int nbPWar, String imageFront) {
        this.quantity = quantity;
        this.nbPVictoire = nbPVictoire;
        this.imageFront = imageFront;
        this.nbPWar=nbPWar;
    }

    public String getImageFront() {return imageFront;}

    public int getQuantity() {return quantity;}

    public int getNbPVictoire() {return nbPVictoire;}

    public int getNbPWar() {return nbPWar;}

    public abstract Card clone();

}
