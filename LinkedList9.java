package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList9 {
    //9. Напишите программу на Java для вставки некоторых элементов в указанной позиции в связанный список.
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6));
        System.out.println(num);
        num.add(1, 22);
        num.add(5, 99);
        System.out.println(num);
    }
}
