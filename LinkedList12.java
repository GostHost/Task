package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList12 {
    //12. Напишите Java-программу для удаления указанного элемента из связанного списка.
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>(List.of("a", "b", "c", "d", "e"));
        System.out.println("Before: " + str);
        str.remove(0);
        System.out.println("After: " + str);
    }
}
