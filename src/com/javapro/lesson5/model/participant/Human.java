package com.javapro.lesson5.model.participant;

public class Human extends Participant {


    public Human(String name, int distanceLimitRun, int limitJump) {
        super(name, distanceLimitRun, limitJump);
    }

    @Override
    public String toString() {
        return super.toString() + "Human " + name + " ";
    }
}

