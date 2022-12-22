import java.util.HashMap;
import java.util.Map;

public class TaskFromJavaRush3 {
    //3. Коллекция HashMap из котов
    //
    //Есть класс Cat, с полем имя (name, String).
    //Создать коллекцию HashMap<String, Cat>.
    //Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    //Вывести результат на экран, каждый элемент с новой строки.
    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat " +
                    "name: " + name + '\'' +
                    " iz kvartiry";
        }
        public static void main(String[] args) {
            HashMap<Cat, String> cats = new HashMap<>();
            Cat cat1 = new Cat("Barsik");
            Cat cat2 = new Cat("Matroskin");
            Cat cat3 = new Cat("Ryzhik");
            Cat cat4 = new Cat("Vaska");
            Cat cat5 = new Cat("Murzik");
            cats.put(cat1, "kv2");
            cats.put(cat2, "kv5");
            cats.put(cat3, "kv10");
            cats.put(cat4, "kv9");
            cats.put(cat5, "kv1");
            for(Map.Entry<Cat,String> s : cats.entrySet()){
                System.out.println(s.getKey() + " " + s.getValue());
            }

        }

    }



}
