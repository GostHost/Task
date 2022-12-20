package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList12 {
    //12. Напишите программу на Java для извлечения части списка массивов.
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("Russia", "USA", "Germany", "Italy", "Poland", "Argentina"));
        System.out.println("Before: " + str);
        System.out.println("After(from 2 to 4): " + str.subList(2, 4));
    }
}
