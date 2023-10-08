package HW02;

public class Robot extends Participant{
    String producer;
    int yearOfIssue;
    public static int count;

    public Robot(String number, String name, int maxRun, int maxJump, String producer, int yearOfIssue) {
        super(number, name, maxRun, maxJump);
        this.producer = producer;
        this.yearOfIssue = yearOfIssue;
        count++;
    }



//    @Override
//    public void go(Obstacle obstacle) {
//
//    }
//
//    @Override
//    public void run(Obstacle obstacle) {
//
//    }
//
//    @Override
//    public void jump(Obstacle obstacle) {
//
//    }
}
