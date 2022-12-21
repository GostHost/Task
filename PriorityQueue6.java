import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue6 {
    //6. Напишите Java-программу для подсчета количества элементов в приоритетной очереди.
    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        num.add(34);
        num.add(77);
        num.add(2);
        System.out.println(num.size());
    }
}
