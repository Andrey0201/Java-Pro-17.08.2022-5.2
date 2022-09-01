package com.javapro.lesson5.model.participant;

public class Cat extends Participant {

    public Cat(String name, int distanceLimitRun, int limitJump) {
        super(name, distanceLimitRun, limitJump);
    }

    @Override
    public String toString() {
        return super.toString() + "Cat " + name + " ";
    }
}
