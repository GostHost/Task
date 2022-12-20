package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList19 {
    //19. Напишите Java-программу для удаления и возврата первого элемента связанного списка.
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        str1.pop();
        System.out.println(str1);
    }
}
