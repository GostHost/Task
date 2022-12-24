import java.util.HashMap;
import java.util.Map;

public class TaskFromJavaRush15 {
    //3. Люди с одинаковыми именами и/или фамилиями
    //1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
    //2. Пусть среди этих 10 человек есть люди с одинаковыми именами и/или фамилиями.
    //2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
    //3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
    //4. Вывести содержимое Map на экран.
    public class Name{
        public static Map<String,String> name (){
            Map<String,String> name = new HashMap<>();
            name.put("Ivanov1", "Aleksandr1");
            name.put("Ivanov2", "Aleksandr2");
            name.put("Ivanov3", "Aleksandr3");
            name.put("Ivanov4", "Aleksandr3");
            name.put("Ivanov1", "Aleksandr5");
            name.put("Ivanov1", "Aleksandr6");
            return name;
        }
    }
    public static void main(String[] args) {
        System.out.println(Name.name());

    }

}
