package TaskCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList18 {
    //18. Напишите программу на Java, чтобы клонировать связанный список в другой связанный список.
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        LinkedList<String> str2 = new LinkedList<>(List.of());
        for(String s : str1){
            str2.add(s);
        }
        System.out.println(str2);

    }
}
