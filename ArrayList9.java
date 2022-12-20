package TaskCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList9 {
    //9. Напишите программу на Java для копирования одного списка массивов в другой.
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>(List.of("Red", "White", "Blue"));
        List<String> str2 = new ArrayList<>(List.of("Brown", "Black"));
        System.out.println("Before: " + str1);
        Collections.copy(str1, str2);
        System.out.println("After: " + str1);
    }
}
