import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskCollection4 implements Comparable <TaskCollection4> {
    //6. Разделение коллекции
    //Создать коллекцию, содержащую объекты HeavyBox.
    //Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
    //Если вес коробки больше 5, коробка перемещается в другую коллекцию.
    private int number;
    private float weight;

    public TaskCollection4(int number, float weight) {
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
        return "TaskCollection4{" +
                "number=" + number +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(TaskCollection4 o) {
        int result = ((int)this.weight - (int)o.weight);

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskCollection4 that = (TaskCollection4) o;
        return Float.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public static void main(String[] args) {
        TaskCollection4 box1 = new TaskCollection4(1, 4.5f);
        TaskCollection4 box2 = new TaskCollection4(2, 14.5f);
        TaskCollection4 box3 = new TaskCollection4(3, 3.4f);
        TaskCollection4 box4 = new TaskCollection4(4, 10.5f);
        TaskCollection4 box5 = new TaskCollection4(5, 7.9f);
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(box1.getWeight());
        arr.add(box2.getWeight());
        arr.add(box3.getWeight());
        arr.add(box4.getWeight());
        arr.add(box5.getWeight());
        System.out.println(arr);
        System.out.println(getMore5(arr));

    }

    public static <T extends TaskCollection4> List<T> getMore5 (ArrayList<Float> list){
        ArrayList<T> more5 = new ArrayList<>();
        TaskCollection4 etalon = new TaskCollection4(0, 5.0f);

//        for(T n : list){
//            if (etalon.compareTo(n) > 5){
//                more5.add(n);
//            }
//        }
        return more5;
   }


}
