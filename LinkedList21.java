package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList21 {
    //21. Напишите Java-программу для извлечения, но не удаления, последнего элемента связанного списка.
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        System.out.println(str1.peekLast());
    }
}
