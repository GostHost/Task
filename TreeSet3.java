package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet3 {
    //3. Напишите программу на Java, чтобы добавить все элементы указанного набора деревьев в другой набор деревьев
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9,8, 10, 2,41, 75, 62));
        TreeSet<Integer> num2 = new TreeSet<>(num);
        System.out.println(num2);
    }
}
