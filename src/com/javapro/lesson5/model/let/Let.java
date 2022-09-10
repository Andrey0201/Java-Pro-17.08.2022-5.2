package com.javapro.lesson5.model.let;

import com.javapro.lesson5.api.Overcomeable;
import com.javapro.lesson5.model.participant.Participant;

public abstract class Let implements Overcomeable {

    private int value;


    public Let(int value) {
        this.value = value;
    }

    public abstract boolean overCome(Participant participant);

    public int getValue() {
        return value;
    }

    public abstract String printLet();
}
