package com.javapro.lesson5.model.participant;


abstract public class Participant {


    protected String name;
    private int distanceLimitRun;
    private int distanceLimitJump;


    public Participant(String name, int distanceLimitRun, int distanceLimitJump) {
        this.name = name;
        this.distanceLimitRun = distanceLimitRun;
        this.distanceLimitJump = distanceLimitJump;
    }

    public void run() {
        System.out.println("Run");
    }

    public boolean run(int distance) {
        if (distanceLimitRun >= distance) {
            run();
            return true;
        } else {
            return false;
        }
    }

    public void jump() {
        System.out.println("Jump");
    }

    public boolean jump(int distance) {
        if (distanceLimitJump >= distance) {
            jump();
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Participant ";
    }
}



