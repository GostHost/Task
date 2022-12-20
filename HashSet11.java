package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet11 {
    //11. Напишите Java-программу для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>(Set.of(1, 2, 3, 5, 6));
        HashSet<Integer> num2 = new HashSet<>(Set.of(3, 5, 6, 10, 12));
//        for (Integer n : num1){
//            if (num2.contains(n)){
//                System.out.println(n);
//            }
//        }
        num1.retainAll(num2);
        System.out.println(num1);
    }
}
