package z2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class NumberSetTest {
    public static void main(String[] args) {
        try {
            TreeSet<Integer> numbers = createNumberSet();
            List<Integer> numbersList = createNumberList();
            printNumberCount(numbers, numbersList);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printNumberCount(TreeSet<Integer> numbers, List<Integer> numbersList) {
        for (Integer num : numbers) {
            int count = 0;
            for (int i = 0; i < numbersList.size(); i++) {
                if (num == numbersList.get(i)) {
                    count++;
                }
            }
            System.out.println(num + "-liczba wystapien: " + count);
        }
    }

    private static TreeSet<Integer> createNumberSet() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader
                (new File("numbers.txt")));
        TreeSet<Integer> numbers = new TreeSet<>();
        String line;
        while ((line = bfr.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }
        bfr.close();
        return numbers;
    }

    private static List<Integer> createNumberList() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader
                (new File("numbers.txt")));
        List<Integer> numbersList = new LinkedList<Integer>();
        String line;
        while ((line = bfr.readLine()) != null) {
            numbersList.add(Integer.parseInt(line));
        }
        bfr.close();
        return numbersList;
    }
}
