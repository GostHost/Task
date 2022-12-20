package TaskCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet8 {
    //8. Напишите Java-программу для преобразования хэш-набора в набор деревьев.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Moskva", "London", "Paris", "Rome", "Deli"));
        TreeSet<String> strtree = new TreeSet<>();
        strtree.addAll(str); // or TreeSet<String> strtree = new TreeSet<>(str);
        System.out.println(strtree);
    }
}
