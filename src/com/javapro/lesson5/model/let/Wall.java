package com.javapro.lesson5.model.let;


import com.javapro.lesson5.model.participant.Participant;

public class Wall extends Let{

    public Wall(int value) {
        super(value);
    }

    @Override
    public void overCome(Participant participant) {
        participant.jump();

    }

    @Override
    public String toString() {
        return super.toString() + "Wall" +
                "distance " + getValue() + " metres";
    }


}
