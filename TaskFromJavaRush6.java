import java.util.HashMap;
import java.util.Map;

public class TaskFromJavaRush6 {
    //6. Коллекция HashMap из Object
    //
    //Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    //
    //Пример вывода (тут показана только одна строка):
    //Sim - 5
    public static void main(String[] args) {
        HashMap<String,Object> str = new HashMap<>();
        str.put("Key1", "1");
        str.put("Key2", "2");
        str.put("Key3", "3");
        str.put("Key4", "4");
        str.put("Key5", "5");
        for(Map.Entry<String,Object> s : str.entrySet()){
            System.out.println(s.getKey() + "-" + s.getValue());
        }
    }
}
