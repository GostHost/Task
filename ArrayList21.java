package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList21 {
    //21. Напишите программу на Java, чтобы заменить второй элемент ArrayList указанным элементом.
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("Before: " + num);
        num.set(2, 50);
        System.out.println("After: " + num);
    }
}
