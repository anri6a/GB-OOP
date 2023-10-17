package seminar04;

import java.util.List;

public class Calculator {
    private double result;

    public Double sum(List<? extends Number> list) {
        result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public Double mult(List<? extends Number> list) {
        result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }

    public Double div(List<? extends Number> list) {
        result = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            result /= list.get(i).doubleValue();
        }
        return result;
    }

    public String convertToBinary(Integer number) {
        StringBuilder stringBuilder = new StringBuilder();
        int a;
        while (number != 0) {
            a = number % 2;
            stringBuilder.append(a);
            number /= 2;
        }
        return stringBuilder.reverse().toString();
    }
}
