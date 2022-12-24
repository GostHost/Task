import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskFromJavaRush16 <T extends Comparable>{
    //4. Минимальное из N чисел
    //1. Ввести с клавиатуры число N.
    //2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
    //3. Найти минимальное число среди элементов списка - метод getMinimum.
    public ArrayList<Integer> getIntegerList (){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
            for(int i = 0; i < 5; i ++){
                System.out.println("Add number: ");
                int p = scan.nextInt();
            nums.add(p);}
        return nums;
    }
    public int getMinimum (ArrayList<Integer> arr){
        int min = arr.get(0);
        for (Integer i : arr){
            if (min > i){
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        TaskFromJavaRush16 task = new TaskFromJavaRush16();
        System.out.println(task.getMinimum(task.getIntegerList()));
    }
}
