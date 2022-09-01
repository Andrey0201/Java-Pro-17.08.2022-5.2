package com.javapro.lesson5.model.let;

public class Treadmill extends Let {

    public Treadmill(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.toString() + "Treadmill " +
                "distance " + value + " metres";
    }
}

