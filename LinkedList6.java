package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList6 {
    //6. Напишите программу на Java для вставки элементов в связанный список в первой и последней позиции
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6));
        System.out.println("Before: " + num);
        num.addFirst(41);
        System.out.println("Insert last: " + num);
        num.addLast(55);
        System.out.println("Insert first: " + num);
    }
}
