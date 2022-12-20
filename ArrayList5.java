package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    //5. Напишите Java-программу для обновления определенного элемента массива по заданному элементу.
    public static void main(String[] args) {
        List<String> str = new ArrayList(List.of("w", "f", "t", "d"));
        System.out.println(str);
        str.set(0, "a");
        System.out.println(str);
    }
}
