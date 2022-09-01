package com.javapro.lesson5.model.participant;

public class Robot extends Participant {


    public Robot(String name, int distanceLimitRun, int limitJump) {
        super(name, distanceLimitRun, limitJump);
    }

    @Override
    public String toString() {
        return super.toString() + "Robot " + name + " ";
    }
}

