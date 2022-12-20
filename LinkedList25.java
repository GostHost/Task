package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList25 {
    //25. Напишите Java-программу для проверки того, что связанный список пуст или нет.
    public static void main(String[] args) {
        List<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        System.out.println(str1.isEmpty());
    }
}
