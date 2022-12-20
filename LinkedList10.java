package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList10 {
    //10. Напишите программу на Java, чтобы получить первое и последнее вхождение указанных элементов в связанный список.
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6));
        System.out.println(num.getFirst());
        System.out.println(num.getLast());
    }
}
