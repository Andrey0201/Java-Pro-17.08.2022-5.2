package com.javapro.lesson5.model.let;


import com.javapro.lesson5.model.participant.Participant;

public class Treadmill extends Let {

    public Treadmill(int value) {
        super(value);
    }

    @Override
    public void overCome(Participant participant) {
        participant.run();
    }

    @Override
    public String toString() {
        return super.toString() + "Treadmill " +
                "distance " +getValue()+ " metres";
    }


}

