package TaskCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList17 {
    //17. Напишите программу на Java, чтобы очистить список массивов
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("Before: " + nums1);
        nums1.removeAll(nums1);
        System.out.println("After removeAll: " + nums1);
    }
}
