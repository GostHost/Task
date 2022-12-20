package TaskCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet9 {
    //9. Напишите программу на Java для преобразования хэш-набора в List / ArrayList.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Moskva", "London", "Paris", "Rome", "Deli"));
        List<String> strarr = new ArrayList<>(str);
        System.out.println(strarr);
    }
}
