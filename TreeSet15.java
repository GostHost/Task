package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet15 {
    //15. Напишите программу на Java для извлечения и удаления последнего элемента набора деревьев
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2, 41, 75, 62));
        num.pollLast();
        System.out.println(num);
    }
}
