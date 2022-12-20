package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList15 {
    //15. Напишите программу на Java для объединения двух списков массивов.
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>(List.of("Red", "White", "Blue"));
        List<String> str2 = new ArrayList<>(List.of("Brown", "Black"));
        System.out.println("Before: " + str1);
        str1.addAll(str2);
        System.out.println("After: " + str1);
    }
}
