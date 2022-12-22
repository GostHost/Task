import java.util.HashMap;
import java.util.Map;

public class TaskFromJavaRush4 {
    //4. Вывести на экран список ключей
    //
    //Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    //Вывести на экран список ключей, каждый элемент с новой строки.
    public static void main(String[] args) {
        HashMap<String, String> str = new HashMap<>();
        str.put("арбуз", "ягода");
        str.put("банан", "трава");
        str.put("вишня", "ягода");
        str.put("груша", "фрукт");
        str.put("дыня", "овощ");
        str.put("ежевика", "куст");
        str.put("жень-шень", "корень");
        str.put("земляника", "ягода");
        str.put("ирис", "цветок");
        str.put("картофель", "клубень");
        for(Map.Entry<String, String> s : str.entrySet()){
            System.out.println(s.getKey());
        }
    }
}
