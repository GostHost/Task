import java.util.PriorityQueue;

public class PriorityQueue10 {
    //10. Напишите Java-программу для преобразования приоритетной очереди в массив, содержащий все элементы очереди
    public static void main(String[] args) {
        PriorityQueue<String> str = new PriorityQueue<>();
        str.add("London");
        str.add("Washingthon");
        str.add("New York");
        str.add("Paris");
        String [] arr = str.toArray(new String[0]);
        for (String s : arr){
            System.out.println(s);
        }
    }
}
