package z2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NumberSetTest {
    public static void main(String[] args) {
        try {
            Pair pair = new Pair().invoke();
            Set<Integer> numbers = pair.getNumbers();
            List<Integer> numbersList = pair.getNumbersList();
            printNumberCount(numbers, numbersList);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printNumberCount(Set<Integer> set, List<Integer> list) {
        for (Integer num : set) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (num == list.get(i)) {
                    count++;
                }
            }
            System.out.println(num + "-liczba wystapien: " + count);
        }
    }

    private static class Pair {
        private Set<Integer> numbers;
        private List<Integer> numbersList;

        public Set<Integer> getNumbers() {
            return numbers;
        }

        public List<Integer> getNumbersList() {
            return numbersList;
        }

        public Pair invoke() throws IOException {
            BufferedReader bfr = new BufferedReader(new FileReader
                    (new File("numbers.txt")));
            Pair pair = new Pair();
            pair.numbers = new TreeSet<>();
            pair.numbersList = new LinkedList<>();
            String line;
            while ((line = bfr.readLine()) != null) {
                pair.numbers.add(Integer.parseInt(line));
                pair.numbersList.add(Integer.parseInt(line));
            }
            bfr.close();
            return pair;
        }
    }
}
