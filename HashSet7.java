package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet7 {
    //7. Напишите Java-программу для преобразования хэш-набора в массив.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Moskva", "London", "Paris", "Rome", "Deli"));
        String [] arr = new String [str.size()];
        str.toArray(arr);
        for (String s : arr){
            System.out.println(s);
        }
    }
}
