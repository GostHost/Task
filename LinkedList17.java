package TaskCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList17 {
    //17. Напишите программу на Java, чтобы объединить два связанных списка.
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        LinkedList<String> str2 = new LinkedList<>(List.of("Bu","Ba","Na","Na"));
        str1.addAll(str2);
        System.out.println(str1);

    }
}
