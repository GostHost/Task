package TaskCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList14 {
    //14. Напишите Java-программу, поменявшую два элемента в списке массивов.
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("Red", "White", "Blue"));
        System.out.println(str);
        Collections.swap(str, 0, 2);
        System.out.println(str);
    }
}
