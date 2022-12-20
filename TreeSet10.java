package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet10 {
    //10. Напишите программу на Java, чтобы получить элемент в наборе деревьев, который больше или равен данному элементу
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2, 41, 75, 62));
        for (Integer n : num){
            if(n >= 10){
                System.out.println(n);
            }
        }
    }
}
