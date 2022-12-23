import java.util.*;
import java.util.stream.Collectors;

public class TaskFromJavaRush12 {
    //5. Удалить людей, имеющих одинаковые имена
    //Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
    // Удалить людей, имеющих одинаковые имена.
    public static HashMap<String,String> createMap() {
        HashMap<String, String> fio = new HashMap<>();
        fio.put("Ivanov1", "Aleksandr1");
        fio.put("Ivanov2", "Aleksandr");
        fio.put("Ivanov3", "Aleksandr3");
        fio.put("Ivanov4", "Aleksandr4");
        fio.put("Ivanov5", "Aleksandr");
        fio.put("Ivanov6", "Aleksandr6");
        fio.put("Ivanov7", "Aleksandr7");
        fio.put("Ivanov8", "Aleksandr8");
        fio.put("Ivanov9", "Aleksandr");
        fio.put("Ivanov10", "Aleksandr10");
        return fio;

    }
    public static void copy (HashMap<String,String> map, String value){
        Map<String,String> copy = new HashMap<>(map);
        for(Map.Entry<String,String> pair : copy.entrySet()){
            if (pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }
    public static void remove (HashMap<String,String> map){
        for(Map.Entry<String,String> pair : map.entrySet()){
            String name = pair.getValue();
            copy(map, name);
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> map = createMap();
        System.out.println("Before: " + map);
        remove(map);
        System.out.println("After: " + map);
    }

}
