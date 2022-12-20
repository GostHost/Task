package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    //1. Напишите Java-программу для создания нового набора деревьев,
    // добавьте несколько цветов (строку) и распечатайте набор деревьев.
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(Set.of("Red", "Yellow"));
        tree.add("Black");
        tree.add("Brown");
        System.out.println(tree);
    }
}
