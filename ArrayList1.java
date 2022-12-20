package TaskCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    //1. Напишите программу на Java, чтобы создать новый список массивов, добавить
    // несколько цветов (строку) и распечатать коллекцию
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("Blue");
        color.add("Red");
        color.add("White");
        System.out.println(color);
    }
}
