package TaskCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList23 {
    //23. Напишите программу на Java для преобразования связанного списка в список массивов.
    public static void main(String[] args) {
        LinkedList<String> str1 = new LinkedList<>(List.of("Bla","No","Bla","Yes"));
        ArrayList<String> str2 = new ArrayList<>(str1);
        for(String s : str2){
            System.out.println(s);
        }
    }
}
