package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet9 {
    //9. Напишите программу на Java, чтобы найти числа меньше 7 в наборе деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2, 41, 75, 62));
        for (Integer n : num){
            if (n < 7){
                System.out.println(n);
            }
        }
    }
}
