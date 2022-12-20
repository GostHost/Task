package TaskCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSet6 {
    //6. Напишите Java-программу для клонирования хеш-набора в другой хеш-набор.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("Moskva", "London", "Paris", "Rome", "Deli"));
        HashSet<String> strclone = new HashSet<>();
        if (strclone.isEmpty()){
        for (String s : str){
            strclone.add(s);
        }}
        System.out.println(strclone);
    }
}
