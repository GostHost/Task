package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet8 {
    //8. Напишите программу на Java для сравнения двух наборов деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2,41, 75, 62));
        TreeSet<Integer> num2 = new TreeSet<>(Set.of(41, 19, 8, 11, 2,4, 75, 24));
        for (Integer n : num){
            if(num2.contains(n)){
            System.out.println(n);}
        }
    }
}
