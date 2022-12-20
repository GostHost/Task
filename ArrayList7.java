package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList7 {
    //7. Напишите программу на Java для поиска элемента в списке массивов.
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("a", "b", "c", "d", "d", "e"));
        if (str.contains("b")){
            System.out.println("Element found");
        }
        else System.out.println("Error");
    }
}
