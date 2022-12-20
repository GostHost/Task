package TaskCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList3 {
    //3. Напишите Java-программу для итерации по всем элементам в связанном списке, начиная с указанной позиции.
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>(List.of(1,2,3,4,55));
        Iterator n = num.listIterator(2);
        while (n.hasNext()){
            System.out.println(n.next());
        }
    }
}
