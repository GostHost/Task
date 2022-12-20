package TaskCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList4 {
    //4. Напишите Java-программу для итерации связанного списка в обратном порядке.
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>(List.of(1,2,3,4,55));
        Collections.sort(num, Collections.reverseOrder());
        System.out.println(num);
    }
}
