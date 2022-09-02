package com.javapro.lesson5.model.let;

import com.javapro.lesson5.service.LetType;

public class Treadmill extends Let {

    public Treadmill(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.toString() + "Treadmill " +
                "distance " + value + " metres";
    }

    @Override
    public LetType getLetType() {
        return LetType.TREADMILL;
    }
}

