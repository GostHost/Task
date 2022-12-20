package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
    //2. Напишите Java-программу для перебора всех элементов в связанном списке.
    public static void main(String[] args) {
        List<String> str = new LinkedList<>(List.of("a", "b","c", "d"));
        System.out.println(str);
        for(String s : str){
            System.out.println(s);
        }
    }
}
