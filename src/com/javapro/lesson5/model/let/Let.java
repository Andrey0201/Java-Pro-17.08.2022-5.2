package com.javapro.lesson5.model.let;


import com.javapro.lesson5.model.participant.Participant;

public abstract class Let {
   private int value;
    Participant participant;
    public Let(int value) {
        this.value = value;
    }

    public abstract void overCome(Participant participant);

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return " Let ";
    }

}
