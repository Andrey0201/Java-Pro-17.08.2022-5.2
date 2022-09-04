package com.javapro.lesson5;

import com.javapro.lesson5.model.let.Treadmill;
import com.javapro.lesson5.model.let.Wall;
import com.javapro.lesson5.model.participant.Cat;
import com.javapro.lesson5.model.participant.Human;
import com.javapro.lesson5.model.participant.Robot;
import com.javapro.lesson5.model.participant.Participant;
import com.javapro.lesson5.model.let.Let;


public class Main {
    private static Participant[] arrayParticipant = null;
    private static Let[] arrayLets = null;

    public static void main(String[] args) {
        createLets();
        createParticipant();
        actionAllParticipant();
        Participant cat = new Cat("Myrca", 130, 5);
        cat.jump();
        cat.run();
    }

    private static void createParticipant() {
        arrayParticipant = new Participant[]{
                new Human("Ivan", 130, 8),
                new Robot("Galaxy", 115, 10),
                new Cat("Bonya", 130, 11)
        };
    }

    private static void createLets() {
        arrayLets = new Let[]{
                new Treadmill(125),
                new Wall(9),
        };
    }

    private static void actionAllParticipant() {
        for (Participant participant : arrayParticipant) {
            for (Let let : arrayLets) {
                boolean b = switch (let.getLetType()) {
                    case TREADMILL -> participant.run(let.getValue());
                    case WALL -> participant.jump(let.getValue());
                };
                if (b) {
                    System.out.println(participant.toString() + let.toString());
                } else {
                    System.out.println(participant.toString() + " can't " + let.toString());
                    break;
                }
            }
        }
    }
}




