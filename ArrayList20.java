package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList20 {
    //20. Напишите программу на Java, чтобы увеличить размер списка массивов.
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3,4,5,6));
        num.ensureCapacity(10);
    }
}
