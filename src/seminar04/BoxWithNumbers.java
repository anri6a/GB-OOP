package seminar04;

public class BoxWithNumbers<N extends Number> {
    private N[] array;

    public BoxWithNumbers(N[] array) {
        this.array = array;
    }

    public BoxWithNumbers() {
    }

    public N[] getArray() {
        return array;
    }

    public void setArray(N[] array) {
        this.array = array;
    }

    public Double average() {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].doubleValue();
        }
        return result/array.length;
    }
    public boolean compareAverage(BoxWithNumbers <? extends Number> boxWithNumbers){ //wildcard generic
        return average().equals(boxWithNumbers.average());
    }
}
