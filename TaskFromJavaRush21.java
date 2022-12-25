import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskFromJavaRush21 {
    //1. Номер месяца
    //Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
    // «May is 5 month». Используйте коллекции.
    public static void main(String[] args) {
        Map<String,String> month = new HashMap<>();
        month.put("January", "January is 1 month");
        month.put("February", "February is 2 month");
        month.put("March", "March is 3 month");
        month.put("April", "April is 4 month");
        month.put("May", "May is 5 month");
        month.put("June", "June is 6 month");
        month.put("July", "July is 7 month");
        month.put("August", "August is 8 month");
        month.put("September", "September is 9 month");
        month.put("October", "October is 10 month");
        month.put("November", "November is 11 month");
        month.put("December", "December is 12 month");
        Scanner scan = new Scanner(System.in);
        System.out.println("Write name month: ");
        System.out.println(month.get(scan.next()));
    }
}
