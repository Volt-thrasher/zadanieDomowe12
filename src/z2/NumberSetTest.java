package z2;

import com.sun.jdi.Value;

import java.io.*;
import java.util.LinkedList;
import java.util.TreeSet;

public class NumberSetTest {
    public static void main(String[] args) {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader
                    (new File("numbers.txt")));
            LinkedList<Integer> numbersList = new LinkedList<>();
            TreeSet<Integer> numbers = new TreeSet<>();
            String line;
            while ((line=bfr.readLine())!=null){
                numbersList.add(Integer.parseInt(line));
                numbers.add(Integer.parseInt(line));
            }
            for (Integer num : numbers) {
                int count = 0;
                for (int i = 0; i <numbersList.size() ; i++) {
                    if (num == numbersList.get(i)){
                        count++;
                    }
                }
                System.out.println(num+"-liczba wystapien: "+count);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
