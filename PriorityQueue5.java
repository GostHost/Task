import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue5 {
    //5. Напишите программу на Java, чтобы удалить все элементы из очереди с приоритетами.
    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        num.add(34);
        num.add(77);
        num.add(2);
        System.out.println("Before: " + num);
        num.removeAll(num);
        System.out.println("After remove: " + num);
    }
}
