package com.javapro.lesson5.model.let;


import com.javapro.lesson5.model.participant.Participant;

public class Wall extends Let {

    public Wall(int value) {
        super(value);
    }

    @Override
    public void overCome(Participant participant) {
        if (participant.getDistanceLimitJump() >= getValue()) {
            participant.jump();
        } else System.out.println("can't run");

    }


    @Override
    public String toString() {
        return super.toString() + "Wall" +
                "distance " + getValue() + " metres";
    }


}
