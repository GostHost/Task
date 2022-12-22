import java.util.HashMap;
import java.util.Map;

public class TaskFromJavaRush2 {
    //Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
    // груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
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
        for(Map.Entry<String, String> s: str.entrySet()){
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
