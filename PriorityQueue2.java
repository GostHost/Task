import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {
    //2. Напишите Java-программу для итерации всех элементов в очереди с приоритетами.
    public static void main(String[] args) {
        Queue<Integer> nums = new PriorityQueue<>();
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(32);
        for (Integer i : nums){
            System.out.println(i);
        }
    }
}
