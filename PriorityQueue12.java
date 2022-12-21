import java.util.PriorityQueue;

public class PriorityQueue12 {
    //12. Напишите программу на Java, чтобы изменить priorityQueue на максимально приоритетный.
    public static void main(String[] args) {
        PriorityQueue<Integer> str = new PriorityQueue<>();
        str.add(56);
        str.add(41);
        str.add(35);
        str.add(63);
        System.out.println("Normal priority: " + str);
        Integer val = null;
        while( (val = str.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }

}
