package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet12 {
    //12. Напишите программу на Java, чтобы получить элемент в наборе деревьев, который строго больше или равен данному элементу
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2, 41, 75, 62));
        System.out.println(num.higher(9));
    }
}
