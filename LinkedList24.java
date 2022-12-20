package TaskCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList24 {
    //24. Напишите программу на Java для сравнения двух связанных списков.
    public static void main(String[] args) {
        List<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        List<String> str2 = new LinkedList<>(List.of("Orange","No","Qwer","Yes"));
        List<String> str3 = new LinkedList<>();
        for(String s : str1){
            str3.add(str2.contains(s) ? "Yes" : "No");
            System.out.println(str1.contains(str3));
        }

    }
}
