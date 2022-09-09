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

        createParticipant();
        createLets();
        Participant human = new Human("Andrey", 160, 56);
        human.run();
        Let wall = new Wall(50);
        wall.overCome(human);
        actionAllParticipant();
        actionAllParticipantWithLimit();
    }

    private static void createParticipant() {
        arrayParticipant = new Participant[]{
                new Human("Ivan", 151, 20),
                new Robot("Galaxy", 100, 60),
                new Cat("Bonya", 160, 70)};
    }

    private static void createLets() {
        arrayLets = new Let[]{
                new Treadmill(150),
                new Wall(20),};
    }

    private static void actionAllParticipant() {
        for (Participant participant : arrayParticipant) {
            for (Let let : arrayLets) {
                let.overCome(participant);
            }
        }
    }

    private static void actionAllParticipantWithLimit() {
        for (Participant participant : arrayParticipant) {
            for (Let let : arrayLets) {
                if (!let.overCome(participant)) {
                    break;
                }
            }
        }
    }
}





