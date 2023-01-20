package com.example.interface7wonders;

import javafx.scene.image.Image;

public class Merveilles {
    private String name;
    private String image;

    public Merveilles(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
