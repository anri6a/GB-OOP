package seminar02Animals;

public class Tiger extends Cat{
    static int countTiger;

    public Tiger(int maxRun, int maxSwim, String name, String breed) {
        super(maxRun, maxSwim, name, breed);
        countTiger++;
    }
}
