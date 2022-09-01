package com.javapro.lesson5;

import com.javapro.lesson5.model.let.Treadmill;
import com.javapro.lesson5.model.let.Wall;
import com.javapro.lesson5.model.participant.Cat;
import com.javapro.lesson5.model.participant.Human;
import com.javapro.lesson5.model.participant.Robot;
import com.javapro.lesson5.model.participant.Participant;
import com.javapro.lesson5.model.let.Let;


public class Main {

    private static Participant[] participants = null;
    private static Let[] lets = null;

    public static void main(String[] args) {
        createLets();
        createParticipant();
        actionAllParticipant();
    }

    private static void createParticipant() {
        participants = new Participant[]{
                new Human("Ivan", 130, 10),
                new Robot("Galaxy", 130, 3),
                new Cat("Bonya", 100, 11)
        };
    }

    private static void createLets() {
        lets = new Let[]{
                new Treadmill(125),
                new Wall(9),
        };
    }

    private static void actionAllParticipant() {

        for (Participant p : participants) {
            if (p.getDistanceLimitRun() >= lets[0].getValue() && p.getLimitJump() >= lets[1].getValue()) {
                p.run();
                p.jump();
                System.out.println(p.toString() + lets[0].toString());
                System.out.println(p.toString() + lets[1].toString());
            }
            if (p.getDistanceLimitRun() < lets[0].getValue()) {
                System.out.println(p.toString() + " don't " + lets[0].toString());
                continue;
            }
            if (p.getLimitJump() < lets[1].getValue()) {
                System.out.println(p.toString() + " don't " + lets[1].toString());
            }
        }
    }
}



