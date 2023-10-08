package HW02;

abstract class Participant implements ParticipantMoveble {
    String number;
    String name;
    int maxRun, maxJump;
    public static int count;

    public Participant(String number, String name, int maxRun, int maxJump) {
        this.number = number;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        count++;
    }

    @Override
    public void go(Obstacle obstacle) {
        if (obstacle instanceof Treadmil) {
            run(obstacle);
        } else {
            jump(obstacle);
        }
    }

    @Override
    public void run(Obstacle obstacle) {
        if (obstacle.volume <= maxRun) {
            System.out.println("Participant " + name + " " + number + " run " + obstacle.volume + " meters!!!");
        } else {
            System.out.println("Participant " + name + " " + number + " leave distance...");
//            Main.participants.removeIf(participant-> obstacle.volume > maxRun);
        }
    }
//    public void removeParticipant(List<Participant> participants, Participant participant){
//        participants.removeIf(participant-> participant )
//
//    }

    @Override
    public void jump(Obstacle obstacle) {
        if (obstacle.volume <= maxJump) {
            System.out.println("Participant " + name + " " + number + " jump " + obstacle.volume + " meters!!!");
        } else {
            System.out.println("Participant " + name + " " + number + " leave distance...");
//            Main.participants.remove(participant);
        }
    }
}
