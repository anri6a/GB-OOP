package seminar01;


public class MainVector {
    public static void main(String[] args) {
        Vector one = new Vector(3,6,8);
        Vector two = new Vector(12,15,8);
        System.out.println("one.lenVector() = " + one.lenVector());
        System.out.println("one.scalar(two) = " + one.scalar(two));
        System.out.println("one.multipl(two) = " + one.multipl(two));
        System.out.println("one.cosin(two) = " + one.cosin(two));
    }
}
