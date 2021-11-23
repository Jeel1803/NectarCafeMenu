package com.jack.cafe;

public class Selection {
    String name;
    String shortDescription;
    int description;
    int image;

    public Selection(String name, String shortDescription, int description, int image) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
