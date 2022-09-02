package com.javapro.lesson5;

import com.javapro.lesson5.model.let.Treadmill;
import com.javapro.lesson5.model.let.Wall;
import com.javapro.lesson5.model.participant.Cat;
import com.javapro.lesson5.model.participant.Human;
import com.javapro.lesson5.model.participant.Robot;
import com.javapro.lesson5.model.participant.Participant;
import com.javapro.lesson5.model.let.Let;
import com.javapro.lesson5.service.LetType;


public class Main {

    private static Participant[] arrayParticipant = null;
    private static Let[] arrayLets = null;

    public static void main(String[] args) {
        createLets();
        createParticipant();
        actionNewAllParticipant();
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
/**
 *  All's Running and Jumping without  Let
 **/
    private static void actionAllParticipant() {
        for (Participant participant : arrayParticipant) {
            for (Let let : arrayLets) {
                switch (let.getLetType()) {
                    case TREADMILL -> participant.run();
                    case WALL -> participant.jump();
                }
                System.out.println(participant.toString() + let.toString());
            }

        }

    }
    /**
     *  All's Running and Jumping with  Let and with limit value
     **/
    private static void actionNewAllParticipant() {
        for (Participant participant : arrayParticipant) {
            for (Let let: arrayLets) {
                if ((let.getLetType().equals(LetType.TREADMILL) && let.getValue() >= participant.getDistanceLimitRun())
                        ||
                        (let.getLetType().equals(LetType.WALL) && let.getValue() >= participant.getLimitJump())) {
                    System.out.println(participant.toString() + " can't " + let.toString());
                    break;
                }
                switch (let.getLetType()) {
                    case TREADMILL -> participant.run();
                    case WALL -> participant.jump();
                }
                System.out.println(participant.toString() + let.toString());
            }

        }

    }
}




