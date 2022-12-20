package TaskCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList10 {
    //10. Напишите программу на Java для перемешивания элементов в списке массивов.
    public static void main(String[] args) {
        List<String> str = new ArrayList(List.of("a", "b", "c", "d", "e", "f"));
        System.out.println("Before shuffle: " + str);
        Collections.shuffle(str);
        System.out.println("After shuffle: " + str);
    }
}
