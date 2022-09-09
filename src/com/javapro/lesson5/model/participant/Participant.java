package com.javapro.lesson5.model.participant;


abstract public class Participant {

    private String name;
    private int distanceLimitRun;
    private int distanceLimitJump;

    public Participant(String name, int distanceLimitRun, int distanceLimitJump) {
        this.name = name;
        this.distanceLimitRun = distanceLimitRun;
        this.distanceLimitJump = distanceLimitJump;
    }

    public abstract void run();

    public abstract void jump();

    public abstract String printName();

    public String getName() {
        return name;
    }

    public int getDistanceLimitRun() {
        return distanceLimitRun;
    }

    public int getDistanceLimitJump() {
        return distanceLimitJump;
    }
}



