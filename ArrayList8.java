package TaskCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList8 {
    //8. Напишите программу на Java для сортировки заданного списка массивов.
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("a", "e", "d", "f", "c", "b"));
        System.out.println("Before: " + str);
        str.sort(null);
        System.out.println("After: " + str);
        Collections.sort(str,Collections.reverseOrder());
        System.out.println("Reverse: " + str);
        List<Integer> nums = new ArrayList<>(List.of(5, 85, 23, 4, 9, 16, 52));
        System.out.println("Before: " + nums);
        nums.sort(null);
        System.out.println("After: " + nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Reverse: " + nums);
    }
}
