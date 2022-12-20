package TaskCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList19 {
    //19. Напишите программу на Java, чтобы урезать емкость списка массивов текущим размером списка.
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(num.size());
        num.trimToSize();
        System.out.println(num.size());
    }
}
