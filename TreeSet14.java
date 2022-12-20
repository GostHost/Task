package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet14 {
    //14. Напишите программу на Java для извлечения и удаления первого элемента набора деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2, 41, 75, 62));
        num.pollFirst();
        System.out.println(num);
    }
}
