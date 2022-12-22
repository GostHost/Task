import java.util.HashSet;
import java.util.Set;

public class TaskFromJavaRush1 {
    //1. HashSet из растений
    //
    //Создать коллекцию HashSet с типом элементов String.
    //Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    //Посмотреть, как изменился порядок добавленных элементов.
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>(Set.of("арбуз", "банан", "вишня"));
        str.add("груша");
        str.add("дыня");
        str.add("ежевика");
        str.add("жень-шень");
        str.add("земляника");
        str.add("ирис");
        str.add("картофель");
        System.out.println(str);
        for(String s : str){
            System.out.println(s);
        }
    }
}
