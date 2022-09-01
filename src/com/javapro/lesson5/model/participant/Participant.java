package com.javapro.lesson5.model.participant;


abstract public class Participant {


    protected String name;
    protected int distanceLimitRun;
    protected int limitJump;


    public Participant(String name, int distanceLimitRun, int limitJump) {
        this.name = name;
        this.distanceLimitRun = distanceLimitRun;
        this.limitJump = limitJump;
    }

    public void run() {
    }

    public void jump() {
    }

    public String getName() {
        return name;
    }

    public int getDistanceLimitRun() {
        return distanceLimitRun;
    }

    public int getLimitJump() {
        return limitJump;
    }

    @Override
    public String toString() {
        return "Participant ";
    }
}



