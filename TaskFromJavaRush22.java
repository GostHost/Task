import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskFromJavaRush22 {
    //2. Нужно добавить в программу новую функциональность.
    //Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
    //Новая задача: Программа должна работать не с номерами домов, а с городами:
    //Пример ввода:
    //Москва
    //Ивановы
    //Киев
    //Петровы
    //Лондон
    //Абрамовичи
    //Лондон
    //Пример вывода:
    //Абрамовичи
    public static void method (HashMap<String, String> map){
        System.out.println("Add home number: ");
        Scanner scan = new Scanner(System.in);
        if(map.isEmpty()){
        System.out.println(map.get(scan.nextInt()));}
        else System.out.println("Error");
    }


    public static void main(String[] args) {
        HashMap<String, String> family = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("Add number house: ");
            String a = scan.next();
            System.out.println("Add family: ");
            String b = scan.next();
            family.put(a, b);
        }
        method(family);
        HashMap<String,String> family2 = new HashMap<>(family);
        for (int i = 0; i < 3; i++){
            System.out.println("Add city: ");
            String a = scan.next();
            System.out.println("Add family: ");
            String b = scan.next();
            family.put(a, b);
        }
        method(family2);

    }

}
