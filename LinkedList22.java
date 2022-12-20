package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList22 {
    //22. Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        System.out.println(str1.contains("No"));
    }
}
