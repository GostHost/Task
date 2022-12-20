package TaskCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList16 {
    //16. Напишите Java-программу для клонирования списка массивов в другой список массивов.
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Integer> clone1 = new ArrayList<>();
        for (Integer n : nums1){
            clone1.add(n);
        }
        System.out.println(clone1);
    }
}
