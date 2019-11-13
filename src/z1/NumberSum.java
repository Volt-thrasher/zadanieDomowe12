package z1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double num;
        createList(input, numbers);
        reverseList(numbers);
        printListSum(numbers);
        printMax(numbers);
        printMin(numbers);
    }

    private static void printMin(ArrayList<Double> numbers) {
        double min = numbers.get(0);
        for (Double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Minimalna wartosc: " + min);
    }

    private static void printMax(ArrayList<Double> numbers) {
        double max = numbers.get(0);
        for (Double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maksymalna wartosc: " + max);
    }

    private static void printListSum(ArrayList<Double> numbers) {
        double sum = 0;
        String s = "";
        for (Double number : numbers) {
            sum += number;
            if (number != numbers.get(numbers.size() - 1)) {
                s += number + "+";
            } else {
                s += number + "=" + sum;
            }
        }
        System.out.println(s);
    }

    private static void reverseList(ArrayList<Double> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }

    private static void createList(Scanner input, ArrayList<Double> numbers) {
        double num;
        do {
            System.out.println("Wprowadz liczbe");
            num = input.nextDouble();
            input.nextLine();
            if (num >= 0) {
                numbers.add(num);
            }
        } while (num >= 0);
    }
}
