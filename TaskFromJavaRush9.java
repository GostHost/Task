import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaskFromJavaRush9 {
    //2. Удалить все числа больше 10
    //
    //Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
    //Удалить из множества все числа больше 10.
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        System.out.println("Before remove: " + nums);
        nums.removeIf(s -> s > 10);
        System.out.println(nums);
    }
}
