package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {
    //4. Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 5, 23, 17, 89));
        System.out.println(nums.get(0));
        System.out.println(nums.get(3));
    }
}
