package TaskCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet6 {
    //6. Напишите Java-программу для клонирования списка наборов деревьев в другой набор деревьев.
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(4, 9, 8, 10, 2,41, 75, 62));
        TreeSet<Integer> numclone = (TreeSet<Integer>)num.clone();
        System.out.println(numclone);;
    }
}
