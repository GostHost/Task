package TaskCollection;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    //1. Напишите программу на Java, чтобы добавить указанный элемент в конец связанного списка.
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>(List.of(1,2,3,4,5));
        System.out.println("Before: " + nums);
        nums.add(6);
        System.out.println("After: " + nums);
    }
}
