package z1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {

        List<Double> numbers = createList();
        reverseList(numbers);
        System.out.println(printListSum(numbers));
        System.out.println("Maksymalna wartosc: " + printMax(numbers));
        System.out.println("Minimalna wartosc: " + printMin(numbers));
    }

    private static double printMin(List<Double> list) {
        double min = list.get(0);
        for (Double number : list) {
            if (number < min) {
                min = number;
            }
        }
        return  min;
    }

    private static double printMax(List<Double> list) {
        double max = list.get(0);
        for (Double number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private static String printListSum(List<Double> list) {
        double sum = 0;
        String s = "";
        for (Double number : list) {
            sum += number;
            if (number != list.get(list.size() - 1)) {
                s += number + "+";
            } else {
                s += number + "=" + sum;
            }
        }
        return s;
    }

    private static void reverseList(List<Double> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    private static List<Double> createList() {
        double num;
        Scanner input = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        do {
            System.out.println("Wprowadz liczbe");
            num = input.nextDouble();
            input.nextLine();
            if (num >= 0) {
                numbers.add(num);
            }
        } while (num >= 0);
        input.close();
        return numbers;
    }
}
