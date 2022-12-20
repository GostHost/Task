package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList5 {
    //5. Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке
    public static void main(String[] args) {
        List<String> str = new LinkedList<>(List.of("a","g","m","k","n"));
        System.out.println("Before: " + str);
        str.add(2,"rex");
        System.out.println("After: " + str);
    }
}
