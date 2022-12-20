package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList18 {
    //18. Напишите Java-программу для проверки того, что список массивов пуст или нет.
    public static void main(String[] args) {
        List<Integer>  num = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer>  num2 = new ArrayList<>();
        System.out.println(num.isEmpty());
        System.out.println(num2.isEmpty());

    }
}
