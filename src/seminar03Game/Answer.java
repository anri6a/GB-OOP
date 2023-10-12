package seminar03Game;

public class Answer {
    int countBull;
    int countCow;
    int maxTry;

    public Answer(int countBull, int countCow, int maxTry) {
        this.countBull = countBull;
        this.countCow = countCow;
        this.maxTry = maxTry;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "countBull=" + countBull +
                ", countCow=" + countCow +
                ", maxTry=" + maxTry +
                '}';
    }
}
