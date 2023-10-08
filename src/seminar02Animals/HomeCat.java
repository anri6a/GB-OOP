package seminar02Animals;

public class HomeCat extends Cat{
    static int countHomeCat;

    public HomeCat(int maxRun, int maxSwim, String name, String breed) {
        super(maxRun, maxSwim, name, breed);
        countHomeCat++;
    }
}
