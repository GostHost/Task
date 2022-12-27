import java.util.ArrayDeque;
import java.util.Deque;

public class TaskCollections3 {
    //5. Создать очередь
    //Создать очередь, содержащую объекты класса HeavyBox.
    //Используем класс ArrayDeque.
    //Поместить объекты в очередь с помощью метода offer().
    //Удалить объекты методом poll().
    private int number;
    private float weight;

    public TaskCollections3(int number, float weight) {
        this.number = number;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TaskCollections3{" +
                "number=" + number +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        TaskCollections3 box1 = new TaskCollections3(1, 2.5f);
        TaskCollections3 box2 = new TaskCollections3(2, 3.5f);
        TaskCollections3 box3 = new TaskCollections3(3, 15.5f);
        TaskCollections3 box4 = new TaskCollections3(4, 12.5f);
        TaskCollections3 box5 = new TaskCollections3(5, 20.5f);
        Deque<Float> deq = new ArrayDeque<>();
        deq.offer(box1.getWeight());
        deq.offer(box2.getWeight());
        deq.offer(box3.getWeight());
        deq.offer(box4.getWeight());
        deq.offer(box5.getWeight());
        System.out.println(deq);
        deq.clear();
        System.out.println(deq);
    }
}
