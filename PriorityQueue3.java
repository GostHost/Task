import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue3 {
    //3. Напишите программу на Java, чтобы добавить все элементы приоритетной очереди в другую приоритетную очередь.
    public static void main(String[] args) {
        Queue<Integer> nums = new PriorityQueue<>();
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(32);
        Queue<Integer> nums2 = new PriorityQueue<>(nums);
        System.out.println(nums2);
    }
}
