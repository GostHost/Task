package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet7 {
    //7. Напишите программу на Java, чтобы получить количество элементов в наборе деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2,41, 75, 62));
        System.out.println(num.size());
    }
}
