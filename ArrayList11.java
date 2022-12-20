package TaskCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList11 {
    //11. Напишите Java-программу для обращения элементов в списке массивов
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4,5,6,8,20,45));
        System.out.println("Before: " + nums);
        Collections.reverse(nums);
        System.out.println("After reverse: " + nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After sort and reverse: " + nums);
    }
}
