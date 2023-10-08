package seminar02Human;

public class Skateboard implements TransportMove {
    @Override
    public void start() {
        System.out.println("skateboard is running");
    }

    public void stop() {
        System.out.println("skateboard stopped");
    }
}
