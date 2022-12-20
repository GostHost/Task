package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList11 {
    //11. Напишите Java-программу для отображения элементов и их позиций в связанном списке.
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>(List.of(1,2,3,4,5,6));
        for(Integer i : num){
            System.out.println(i + "-" + num.indexOf(i));
        }
    }
}
