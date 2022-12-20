package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet16 {
    //16. Напишите Java-программу для удаления заданного элемента из набора деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2, 41, 75, 62));
        num.remove(4);
        System.out.println(num);
    }
}
