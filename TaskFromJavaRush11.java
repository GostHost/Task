import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskFromJavaRush11 {
    //  4. Удалить всех людей, родившихся летом
    //Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
    // Удалить из словаря всех людей, родившихся летом.
    public static class Date {
        private int day;
        private int month;
        private int year;
        public Date (int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public Date (){}

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "day: " + day +
                    ", month: " + month +
                    ", year: " + year +
                    '}';
        }
    }

    public static void main(String[] args) {
        Map<String, Date> list = new HashMap<>();
        Date date = new Date ();
        list.put ("Ivanov", new Date (1, 1, 1980));
        list.put ("Petrov", new Date (13, 6, 1972));
        list.put ("Sidorov", new Date (4, 8, 1970));
        list.put ("Kuznetsov", new Date (11, 4, 1990));
        list.put ("Putin", new Date (7, 3, 1995));
        list.put ("Bobrikov", new Date (9, 11, 2000));
        list.put ("Pupkin", new Date (25, 10, 2010));
        list.put ("Dorohov", new Date (30, 12, 1997));
        list.put ("Lebedev", new Date (10, 2, 1977));
        list.put ("Zaitsev", new Date (6, 5, 1998));
        System.out.println(list);
        Iterator <Map.Entry<String, Date>> map = list.entrySet().iterator();
        while (map.hasNext()){
            int month = map.next().getValue().getMonth();
            if (month > 5 && month < 9){
                map.remove();
            }
        }
        System.out.println(list);
    }
}
