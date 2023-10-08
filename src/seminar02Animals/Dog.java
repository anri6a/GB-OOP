package seminar02Animals;

public class Dog extends Animal {
    String breed;
    static int countDog;


    public Dog(int maxRun, int maxSwim, String name, String breed) {
        super(maxRun, maxSwim, name);
        this.breed = breed;
        countDog++;
        if (maxRun > 500) {
            super.maxRun = 500;
        }
        if (maxSwim > 10) {
            super.maxSwim = 10;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
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
        if (swimDistance < maxSwim) {
            System.out.println(name + " swim " + swimDistance + " meters");
        } else {
            System.out.println(name + " died.");
        }
    }
}
