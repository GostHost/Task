package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    //. Напишите Java-программу для добавления указанного элемента в конец хеш-набора.
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        System.out.println("Before: " + nums);
        nums.add(7);
        System.out.println("After: " + nums);
    }
}
