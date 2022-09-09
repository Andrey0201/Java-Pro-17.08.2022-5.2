package com.javapro.lesson5.model.participant;

public class Robot extends Participant {


    public Robot(String name, int distanceLimitRun, int limitJump) {
        super(name, distanceLimitRun, limitJump);
    }

    @Override
    public void run() {
        System.out.println("Robot " + getName() + " Run");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + getName() + " Jump");
    }

    @Override
    public String printName() {
        return "Participant robot " + getName();
    }
}

