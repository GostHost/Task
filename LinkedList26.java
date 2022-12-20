package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList26 {
    //26. Напишите программу на Java для замены элемента в связанном списке.
    public static void main(String[] args) {
        List<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        str1.set(3, "Chupa");
        System.out.println(str1);
    }
}
