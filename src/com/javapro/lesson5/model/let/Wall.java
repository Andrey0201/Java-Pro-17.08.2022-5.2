package com.javapro.lesson5.model.let;


import com.javapro.lesson5.model.participant.Participant;

public class Wall extends Let {

    public Wall(int value) {
        super(value);
    }

    @Override
    public boolean overCome(Participant participant) {
        boolean isOverCome = participant.getDistanceLimitJump() >= getValue();
        if (isOverCome) {
            participant.jump();
            System.out.println(participant.printName() + printLet());
        } else {
            System.out.println(participant.printName() + " can't " + printLet() +
                    "Over come " + participant.getDistanceLimitJump() + " meters");
        }
        return isOverCome;
    }

    @Override
    public String printLet() {
        return " overcome Let wall height " + getValue() + " meters. ";
    }


    @Override
    public String toString() {
        return super.toString() + "Wall" +
                "distance " + getValue() + " metres";
    }
}
