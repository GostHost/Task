package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    //2. Напишите Java-программу для итерации всех элементов списка массивов
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 5 ,85 , 63 , 52, 40, 7 ,8);
        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
