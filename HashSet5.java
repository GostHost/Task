package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet5 {
    //5. Напишите программу на Java, чтобы проверить, хэш-набор пуст или нет.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Moskva", "London", "Paris", "Rome", "Deli"));
        System.out.println("list is empty? " + str.isEmpty());
        str.removeAll(str);
        System.out.println("and now? " + str.isEmpty());
    }
}
