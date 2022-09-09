package com.javapro.lesson5.model.let;


import com.javapro.lesson5.model.participant.Participant;

public class Treadmill extends Let {

    public Treadmill(int value) {
        super(value);
    }

    @Override
    public boolean overCome(Participant participant) {
        boolean isOverCome = participant.getDistanceLimitRun() >= getValue();
        if (isOverCome) {
            participant.run();
            System.out.println(participant.printName() + printLet());
        } else {
            System.out.println(participant.printName() + " can't " + printLet() +
                    "Over come " + participant.getDistanceLimitRun() + " metres");
        }
        return isOverCome;
    }

    @Override
    public String printLet() {
        return " overcome Let treadmill distance " + getValue() + " metres. ";
    }
}

