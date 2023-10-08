package seminar02Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        Bycicle bycicle = new Bycicle();
        human.drive(car);
        human.drive(car);
        human.stop(car);
        human.stop(car);
        human.drive(new Skateboard());
        human.drive(bycicle);

    }
}
