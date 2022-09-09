package com.javapro.lesson5.model.participant;

public class Human extends Participant {


    public Human(String name, int distanceLimitRun, int limitJump) {
        super(name, distanceLimitRun, limitJump);
    }

    @Override
    public void run() {
        System.out.println("Human " + getName() + " Run");
    }

    @Override
    public void jump() {
        System.out.println("Human " + getName() + " Jump");
    }

    @Override
    public String printName() {
        return "Participant human " + getName();
    }
}

