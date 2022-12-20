package TaskCollection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet4 {
    //4. Напишите программу на Java для создания представления в обратном порядке элементов, содержащихся в
    // данном наборе деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2,41, 75, 62));
        TreeSet<Integer> numreverse = new TreeSet<>();
        numreverse = (TreeSet)num.descendingSet();
        System.out.println(numreverse);


    }
}
