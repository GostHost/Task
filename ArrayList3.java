package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
    //3. Напишите Java-программу для вставки элемента в список массивов в первой позиции.
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("White","Red", "Blue", "Brown", "Black"));
        System.out.println(str);
        str.add(0, "Orange");
        System.out.println(str);
    }
}
