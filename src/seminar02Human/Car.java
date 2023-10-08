package seminar02Human;

public class Car implements TransportMove{

    @Override
    public void start() {
        System.out.println("car is running");
    }




    public void stop() {
        System.out.println("car stopped");
    }
}
