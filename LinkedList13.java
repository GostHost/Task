package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList13 {
    //13. Напишите программу на Java для удаления первого и последнего элемента из связанного списка
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>(List.of("a", "b", "c", "d", "e"));
        System.out.println(str);
        str.removeFirst();
        str.removeLast();
        System.out.println(str);
    }
}
