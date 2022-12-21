import java.util.PriorityQueue;

public class PriorityQueue9 {
    //9. Напишите программу на Java для извлечения и удаления первого элемента.
    public static void main(String[] args) {
        PriorityQueue<String> str = new PriorityQueue<>();
        str.add("London");
        str.add("Washingthon");
        str.add("New York");
        str.add("Paris");
        System.out.println("The first target: " + str.poll());
        System.out.println("Next target: " + str);
    }
}
