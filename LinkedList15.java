package TaskCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList15 {
    //15. Напишите программу на Java, которая поменяет два элемента в связанном списке.
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>(List.of("a", "b", "c", "d", "e"));
        System.out.println(str);
        Collections.swap(str, 0, 4);
        System.out.println(str);
    }
}
