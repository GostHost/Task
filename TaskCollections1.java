import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskCollections1 {
    //3. Набор чисел
    //Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
    //Избавиться от повторяющихся элементов в строке.
    //Вывести результат на экран.
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        Set<String> nums2 = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Add some numbers");
        try {
            String str = reader.readLine();
            nums.addAll(Arrays.asList(str.split(",")));
            System.out.println(nums);
            nums2.addAll(nums);
            System.out.println(nums2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
