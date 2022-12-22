import java.util.Set;
import java.util.TreeSet;

public class TaskFromJavaRush8 {
    //1. 20 слов на букву «Л»
    //
    //Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
    public static void main(String[] args) {
        Set<String> str = new TreeSet<>(Set.of("Lake","Like", "Luser", "Lama", "London", "Liberia", "Luka"));
        for(String s : str){
            System.out.println(s);
        }
    }
}
