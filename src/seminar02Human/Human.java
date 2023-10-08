package seminar02Human;

public class Human {
    //    Создать класс человек с возможностью ездить и останавливаться на:
//    машине, скейтборде,велосипеде(что будет если расширить список ?)
    private TransportMove lastTransport;

    public void drive(TransportMove transportMove) {
        if (lastTransport == null) {
            lastTransport = transportMove;
            lastTransport.start();
        } else {
            System.out.println("just running");
        }
    }

    public void stop(TransportMove transportMove) {
        if (lastTransport != null) {
            lastTransport.stop();
            lastTransport = null;
        } else {
            System.out.println("just stopped");
        }
    }
}
