import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskFromJavaRush23 {
    //3. Задача по алгоритмам.
    //Задача: Введи с клавиатуры 10 слов и выведи их в алфавитном порядке.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            System.out.println("Put word: ");
            String a = scan.nextLine();
            str.add(a);
        }
        Collections.sort(str);
        System.out.println(str);
    }
}
