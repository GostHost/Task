package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {
    //6. Напишите программу на Java для удаления третьего элемента из списка массивов.
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 6, 8, 9, 2, 3 ,4));
        System.out.println(nums);
        nums.remove(2);
        System.out.println(nums);
    }
}
