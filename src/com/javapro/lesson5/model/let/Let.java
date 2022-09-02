package com.javapro.lesson5.model.let;

import com.javapro.lesson5.model.participant.Participant;
import com.javapro.lesson5.service.LetType;

abstract public class Let  {
    protected int value;

    public Let(int value) {
        this.value = value;
    }

    public String overCome() {
        return "overCome";
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return overCome() + " Let ";
    }

    public LetType getLetType() {
        return null;
    }
}
