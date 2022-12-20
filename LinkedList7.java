package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList7 {
    //7. Напишите Java-программу для вставки указанного элемента в начало связанного списка.
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6));
        System.out.println(num);
        num.add(0, 47);
        num.offerFirst(90);
        System.out.println(num);

    }
}
