package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet3 {
    //3. Напишите программу на Java, чтобы получить количество элементов в хэш-наборе.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Red", "White","Blue","Brown"));
        System.out.println(str.size());

    }
}
