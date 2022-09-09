package com.javapro.lesson5.model.participant;

public class Cat extends Participant {

    public Cat(String name, int distanceLimitRun, int limitJump) {
        super(name, distanceLimitRun, limitJump);
    }

    @Override
    public void run() {
        System.out.println("Cat " + getName() + " Run");
    }

    @Override
    public void jump() {
        System.out.println("Cat " + getName() + " Jump");
    }

    @Override
    public String printName() {
        return "Participant cat " + getName();
    }
}
