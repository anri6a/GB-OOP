package HW02;

public class Cat extends Elive {
    String bread;
    public static int count;

    public Cat(String number, String name, int maxRun, int maxJump, int age, String bread) {
        super(number, name, maxRun, maxJump, age);
        this.bread = bread;
        count++;
    }

//    @Override
//    public void go(Obstacle obstacle) {
////        run(obstacle);
////        jump(obstacle);
//        if(obstacle instanceof Treadmil){
//            run(obstacle);
//        } else {
//            jump(obstacle);
//        }
//    }

//    @Override
//    public void run(Obstacle obstacle) {
//        if (obstacle.volume <= maxRun) {
//            System.out.println("Participant " + name + " " + number + " run " + obstacle.volume + " meters!!!");
//        } else {
//            System.out.println("Participant " + name + " " + number + " leave distance...");
//        }
//    }
//
//    @Override
//    public void jump(Obstacle obstacle) {
//        if (obstacle.volume <= maxJump) {
//            System.out.println("Participant " + name + " " + number + " jump " + obstacle.volume + " meters!!!");
//        } else {
//            System.out.println("Participant " + name + " " + number + " leave distance...");
//        }
//
//    }
}
