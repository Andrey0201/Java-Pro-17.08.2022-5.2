package com.javapro.lesson5.model.let;

import com.javapro.lesson5.service.LetType;

public class Wall extends Let{

    public Wall(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.toString() + "Wall" +
                "distance " + value + " metres";
    }

    @Override
    public LetType getLetType() {
        return LetType.WALL;
    }
}
