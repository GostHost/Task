import java.util.HashSet;
import java.util.Set;

public class TaskFromJavaRush13 {
    //1. Set из котов
    //1. Внутри класса Solution создать public static класс кот – Cat.
    //2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него три кота.
    //3. В методе main удалите одного кота из Set cats.
    //4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
    // Каждый кот с новой строки.
    public static class Cat {
        public static Set <String> createCats (){
            Set<String> cats = new HashSet<>();
            cats.add("Vaska");
            cats.add("Murzik");
            cats.add("Bombik");
            return cats;
        }
        public static void printCats (Set<String> cats){
            for(String s : cats){
                System.out.println(s);
            }
        }

        public static void main(String[] args) {
            Set<String> cat = createCats();
            printCats(cat);
            cat.remove("Murzik");
            printCats(cat);
        }
    }
}
