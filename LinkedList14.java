package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList14 {
    //14. Напишите программу на Java, чтобы удалить все элементы из связанного списка.
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>(List.of("a", "b", "c", "d", "e"));
        System.out.println(str);
        str.removeAll(str);
        System.out.println(str);
    }
}
