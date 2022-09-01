package com.javapro.lesson5.model.let;

public class Wall extends Let{

    public Wall(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.toString() + "Wall" +
                "distance " + value + " metres";
    }
}
