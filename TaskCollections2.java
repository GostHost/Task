import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TaskCollections2 {
    //4. Методы union() и intersect()
    //Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения множеств.
    //Протестируйте работу этих методов на предварительно заполненных множествах.
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Set.of(4, 5, 6, 7, 8, 9));
        TaskCollections2 task = new TaskCollections2();
        System.out.println(task.union(set1, set2));
        System.out.println(task.intersect(set1,set2));

    }

    public <T> Set<T> union (Set <T> set1, Set<T> set2){
        HashSet<T> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println(union);
        return union;
    }
    public <T> Set<T> intersect (Set<T> set1, Set<T>set2){
        HashSet<T> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        return inter;
    }
}
