package HW02;

public class Elive extends Participant {
    int age;
    public static int count;

    public Elive(String number, String name, int maxRun, int maxJump, int age) {
        super(number, name, maxRun, maxJump);
        this.age = age;
        count++;
    }



//    @Override
//    public void go(Obstacle obstacle) {
//
//    }
}
