package HW02;

abstract class Obstacle{
    int volume;
    static int count;

    public Obstacle(int volume) {
        this.volume = volume;
        count++;
    }
}
