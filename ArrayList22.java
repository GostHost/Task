package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList22 {
    //22. Напишите Java-программу для печати всех элементов ArrayList, используя расположение элементов
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6));
        for(Integer n : num){
            System.out.println(n);
        }
    }
}
