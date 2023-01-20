package com.example.interface7wonders;

public class Player {
    private String name;
    private Merveilles saMerveille;

    public Player(String name, Merveilles saMerveille) {
        this.name = name;
        this.saMerveille = saMerveille;
    }

    public String getName() {
        return name;
    }

    public Merveilles getSaMerveille() {
        return saMerveille;
    }
    public static void setName(String name) {
        name = name;
    }
    public static void setSaMerveille(Merveilles saMerveille) {
        saMerveille = saMerveille;
    }
}
