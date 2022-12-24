import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskFromJavaRush19 {
    //8. Пять наибольших чисел
    //
    //Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            System.out.println("Add number: ");
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        Collections.reverse(list);
        int count = 0;
        for (Integer i : list){
            if (count < 5){
                System.out.println(i);}
            count ++;
        }
    }
}
