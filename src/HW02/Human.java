package HW02;

public class Human extends Elive{
    String sex;
    public static int count;

    public Human(String number, String name, int maxRun, int maxJump, int age, String sex) {
        super(number, name, maxRun, maxJump, age);
        this.sex = sex;
        count++;
    }

//    @Override
//    public void go(Obstacle obstacle) {
//
//    }

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
