package com.example.interface7wonders;

import com.example.interface7wonders.Wonders.Wonder;

public class Player {
    public static Player option;
    private String name;
    private Wonder saMerveille;
    private int nbPointsVictoire=0;

    public Player(String name, Wonder saMerveille, int nbPointsVictoire) {
        this.name = name;
        this.saMerveille = saMerveille;
        this.nbPointsVictoire=nbPointsVictoire;
    }

    public String getName() {
        return name;
    }

    public Wonder getSaMerveille() {
        return saMerveille;
    }
}
