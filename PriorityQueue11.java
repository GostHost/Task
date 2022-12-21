import java.util.PriorityQueue;

public class PriorityQueue11 {
    //11. Напишите программу на Java для преобразования элементов Priority Queue в строковое представление.
    public static void main(String[] args) {
        PriorityQueue<String> str = new PriorityQueue<>();
        str.add("London");
        str.add("Washingthon");
        str.add("New York");
        str.add("Paris");
        String clone = str.toString();
        System.out.println(clone);
    }
}
