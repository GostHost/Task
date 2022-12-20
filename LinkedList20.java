package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList20 {
    //20. Напишите Java-программу для извлечения, но не удаления, первого элемента связанного списка.
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        System.out.println(str1.peekFirst());
    }
}
