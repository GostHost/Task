package TaskCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {
    //2. Напишите Java-программу для перебора всех элементов в хэш-списке.
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>(Set.of(12, 45, 78, 95, 23, 47, 65));
        System.out.println(nums);
        for(Integer n : nums){
            System.out.print(n+ " ");
        }
        System.out.println();
        Iterator<Integer> p = nums.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
