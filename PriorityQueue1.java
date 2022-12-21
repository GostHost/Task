import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    //1. Напишите программу на Java для создания новой очереди приоритетов, добавьте несколько
    // цветов (строку) и распечатайте элементы очереди приоритетов.
    public static void main(String[] args) {
        Queue<String> color = new PriorityQueue<>();
        color.add("White");
        color.add("Black");
        color.add("Yellow");
        color.add("Brown");
        System.out.println(color);
    }
}
