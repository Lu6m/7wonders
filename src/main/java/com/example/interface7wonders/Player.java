package com.example.interface7wonders;

public class Player {
    private String name;
    private Wonder saMerveille;

    public Player(String name, Wonder saMerveille) {
        this.name = name;
        this.saMerveille = saMerveille;
    }

    public String getName() {
        return name;
    }

    public Wonder getSaMerveille() {
        return saMerveille;
    }
}
