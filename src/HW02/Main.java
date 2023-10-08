package HW02;

import java.util.*;

public class Main {
    public static List<Participant> participants = new ArrayList<>();

    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Treadmil(500),
                new Treadmil(50),
                new Wall(5),
                new Treadmil(1100),
                new Wall(1),
                new Wall(2),
                new Treadmil(150),
                new Treadmil(3)
        };

        participants.add(new Cat("1C", "wer", 3000, 2, 4, "link"));
        participants.add(new Cat("2C", "wer", 3000, 2, 4, "link"));
        participants.add(new Cat("3C", "rew", 100, 10, 6, "poi"));
        participants.add(new Cat("4C", "gfd", 3000, 2, 4, "das"));
        participants.add(new Human("1H", "bgt", 10000, 1, 423, "M"));
        participants.add(new Human("2H", "dwfd", 1000, 2, 32, "F"));
        participants.add(new Robot("1R", "sdc", 3000, 10, "IBM", 2012));
        participants.add(new Robot("2R", "asdwe", 30, 2, "BostRob", 2012));
        participants.add(new Robot("3R", "adbg", 3, 7, "Digit", 2023));


        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                participant.go(obstacle);
            }
            if (obstacle instanceof Treadmil) {
                participants.removeIf(participant -> participant.maxRun < obstacle.volume);
            } else {
                participants.removeIf(participant -> participant.maxJump < obstacle.volume);
            }
            System.out.println("-----------");
        }


    }
}
