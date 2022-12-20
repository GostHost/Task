package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet4 {
    //4. Напишите программу на Java, чтобы очистить хэш-набор.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Moskva", "London", "Paris", "Rome", "Deli"));
        System.out.println("Before: " + str);
        str.removeAll(str);
        System.out.println("After remove: " + str);
    }
}
