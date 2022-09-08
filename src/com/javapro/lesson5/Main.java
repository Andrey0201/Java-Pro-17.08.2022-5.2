package com.javapro.lesson5;

import com.javapro.lesson5.model.let.Treadmill;
import com.javapro.lesson5.model.let.Wall;
import com.javapro.lesson5.model.participant.Cat;
import com.javapro.lesson5.model.participant.Human;
import com.javapro.lesson5.model.participant.Robot;
import com.javapro.lesson5.model.participant.Participant;
import com.javapro.lesson5.model.let.Let;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    private static Participant[] arrayParticipant = null;
    private static Let[] arrayLets = null;

    public static void main(String[] args) {
        createParticipant();
        createLets();
        actionAllParticipant();
        System.out.println(Arrays.toString(arrayParticipant));


    }

    private static void createParticipant() {
        arrayParticipant = new Participant[]{
                new Human("Ivan", 115, 10),
                new Robot("Galaxy", 130, 10),
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
                System.out.print(participant.toString());
                let.overCome(participant);
            }

        }

    }

    private static void actionAllParticipantWithLimit() {
        for (Participant participant : arrayParticipant) {
            for (Let let : arrayLets) {
                if (participant.getDistanceLimitRun() >= let.getValue()) {
                    let.overCome(participant);
                }
                else System.out.println("can't");
                break;
            }

        }

    }
}




