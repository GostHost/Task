import java.util.PriorityQueue;

public class PriorityQueue8 {
    //8. Напишите программу на Java, чтобы получить первый элемент очереди с приоритетами.
    public static void main(String[] args) {
        PriorityQueue<String> str = new PriorityQueue<>();
        str.add("London");
        str.add("Washingthon");
        str.add("New York");
        str.add("Paris");
        System.out.println("The first nuclear shoot: " + str.peek());

    }
}
