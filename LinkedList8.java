package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList8 {
    //8. Напишите Java-программу для вставки указанного элемента в конец связанного списка.
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6));
        System.out.println(num);
        num.offerLast(90);
        System.out.println(num);

    }
}
