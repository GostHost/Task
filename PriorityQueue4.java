import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue4 {
    //4. Напишите Java-программу для вставки данного элемента в очередь с приоритетами.
    public static void main(String[] args) {
        Queue<String> str = new PriorityQueue<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        System.out.println(str);
        str.offer("e");
        System.out.println(str);
    }
}
