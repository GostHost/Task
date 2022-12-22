import java.util.HashMap;
import java.util.Map;

public class TaskFromJavaRush10 {
    //3. Одинаковые имя и фамилия
    //
    //Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
    // Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
    public static void main(String[] args) {
        Map<String, String> fio = new HashMap<>();
        fio.put("Ivanov", "Aleksandr");
        fio.put("Sidorov", "Petr");
        fio.put("Malyshev", "Vasya");
        fio.put("Petrov", "Vasya");
        fio.put("Kuznetsov", "Aleksandr");
        fio.put("Belkin", "Sergey");
        fio.put("Ivanova", "Rodion");
        fio.put("Dmitriev", "Dima");
        fio.put("Golubtsov", "Andrey");
        fio.put("Pupkin", "Pup");
        int countKey = 0;
        int countValue = 0;
        for(Map.Entry<String, String> m : fio.entrySet()){
            if (m.getKey().equals("Ivanov")){
                countKey ++;
            }
            if (m.getValue().equals("Aleksandr")){
                countValue ++;
            }
        }
        System.out.println("Similar family Ivanov: " + countKey);
        System.out.println("Similar name Aleksandr: " + countValue);
    }
}
