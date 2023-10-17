package seminar04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println("sum = " + sum);

//        intBox1.setObj("java");
//        int sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//        System.out.println("sum2 = " + sum2);

        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum3 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum3 = " + sum3);
        }

        GenBox<String> intGenBox1 = new GenBox<>("java");
        GenBox<Integer> intGenBox2 = new GenBox<>(10);
//        int sum4 = intGenBox1.getObj() + intGenBox2.getObj();
        GenBox<Integer> intGenBox3 = new GenBox<>(10);
        int sum5 = intGenBox2.getObj() + intGenBox3.getObj();
        System.out.println("sum5 = " + sum5);

        //__________________________________________________________

        BoxWithNumbers<Integer> boxWithNumbers1 = new BoxWithNumbers<>(new Integer[]{1, 2, 3, 4, 5, 6, 65, 76, 87, 12});
        BoxWithNumbers<Float> boxWithNumbers2 = new BoxWithNumbers<>(new Float[]{1f, 2f, 3f, 4f, 5f, 6f, 65f, 76f, 12f, 87f});
        System.out.println("boxWithNumbers1.average() = " + boxWithNumbers1.average());
        System.out.println("boxWithNumbers2.average() = " + boxWithNumbers2.average());
        System.out.println("boxWithNumbers1.compareAverage(boxWithNumbers2) = " + boxWithNumbers1.compareAverage(boxWithNumbers2));
        //-----------------------------------------------------------

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(new ArrayList<>(Arrays.asList(3, 4, 5, 7, 4, 2, 4, 5))));
        //System.out.println(calculator.sum(new ArrayList<>(Arrays.asList("3", "4", "5", "7"))));
        System.out.println("calculator.mult = " + calculator.mult(new ArrayList<>(Arrays.asList(2, 4, 2.5))));
        System.out.println("calculator.div = " + calculator.div(new ArrayList<>(Arrays.asList(39, 3, 2))));
        System.out.println("calculator.convertToBinary = " + calculator.convertToBinary(13));
        //------------------------------------------------------------

        LRUCach<Employee> employee = new LRUCach<>(3);
        employee.addElement(new Employee("Tom", 1000, "jun"));
        employee.addElement(new Employee("Tom2", 1000, "worker"));
        employee.addElement(new Employee("Tom3", 1000, "middle"));
        employee.addElement(new Employee("Tom4", 1000, "senior"));
        System.out.println("employee.getElement(0) = " + employee.getElement(0));
        System.out.println("employee.getAllElement() = " + employee.getAllElement());
    }
}
