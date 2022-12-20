package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet12 {
    //12. Напишите программу на Java, чтобы удалить все элементы из хеш-набора.
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>(Set.of(1, 2, 3, 5, 6));
        System.out.println(num1);
        num1.removeAll(num1);
        System.out.println(num1);
    }
}
