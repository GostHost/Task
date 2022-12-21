import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue7 {
    //7. Напишите Java-программу для сравнения двух приоритетных очередей.
    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        num.add(34);
        num.add(77);
        num.add(2);
        System.out.println("First queue: " +num);
        Queue<Integer> num2 = new PriorityQueue<>();
        num2.add(5);
        num2.add(47);
        num2.add(2);
        System.out.println("Second queue: " + num2);
        for (Integer i : num){
            if(num2.contains(i)){
                System.out.println("Identical elements: " + i);
            }
        }
    }
}
