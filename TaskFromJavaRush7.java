import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskFromJavaRush7 {
    //1. Создать два списка LinkedList & ArrayList.
    //Нужно создать два списка – LinkedList и ArrayList.
    //2. Провести 10 тысяч вставок, удалений
    //Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
    //3. Измерить сколько времени занимает 10 тысяч вставок для каждого списка
    //Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
    //Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
    //4. Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
    //Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
    //Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        LinkedList<Integer> link = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9));
        Instant start = Instant.now();
        for(int i = 0; i < 10000; i++){
            int a = 1;
            arr.set(2, a);
            arr.remove(4);
            arr.add(4, 4);
        }
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("ArrayList: " + elapsed);
        Instant start2 = Instant.now();
        for(int i = 0; i < 10000; i++){
            int a = 1;
            link.set(2, a);
            link.remove(4);
            link.add(4, 4);
        }
        Instant finish2 = Instant.now();
        long elapsed2 = Duration.between(start2, finish2).toMillis();
        System.out.println("LinkedList: " + elapsed2);

    }

}
