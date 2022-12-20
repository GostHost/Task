package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList13 {
    //13. Напишите программу на Java для сравнения двух списков массивов.
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2,5,8,6,4,6));
        List<Integer> nums2 = new ArrayList<>(List.of(1,3,7,8,6,82));
        System.out.println(nums);
        List<String> nums3 = new ArrayList<>();
        for(Integer n : nums){
        nums3.add(nums2.contains(n) ? "Y" : "N");
            System.out.println(nums3);
        }

    }
}
