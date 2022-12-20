package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {
    //2. Напишите Java-программу для перебора всех элементов в наборе деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(2, 5, 9, 45, 74, 32));
        for (Integer n : num){
            System.out.println(n);
        }
    }
}
