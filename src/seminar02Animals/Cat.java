package seminar02Animals;

public class Cat extends Animal{

    static int countCat;
    String breed;

    public Cat(int maxRun, int maxSwim, String name, String breed) {
        super(maxRun, maxSwim, name);
        this.breed = breed;
        countCat++;
    }



    @Override
    void running(int runDistance) {
        if (runDistance < maxRun) {
            System.out.println(name + " run " + runDistance + " meters");
        } else {
            System.out.println(name + " died.");
        }
    }

    @Override
    void swimming(int swimDistance) {
        System.out.println(name + " hi was a hero, but he drowned");
    }
}
