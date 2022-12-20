package TaskCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList16 {
    //16. Напишите программу на Java, чтобы перемешать элементы в связанном списке.
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>(List.of("a", "b", "c", "d", "e"));
        System.out.println(str);
        Collections.shuffle(str);
        System.out.println(str);
    }
}
