import java.util.HashMap;
import java.util.Map;

public class TaskCollections5 {
    //7. Создать HashMap
    //Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
    //Перебрать и распечатать пары значений - entrySet().
    //Перебрать и распечатать набор из имен продуктов  - keySet().
    //Перебрать и распечатать значения продуктов - values().
    //Для каждого перебора создать свой метод.
    private String nameToy;
    private String Toy;

    public TaskCollections5(String toy) {
        Toy = toy;
    }

    public TaskCollections5(String nameToy, String toy) {
        this.nameToy = nameToy;
        Toy = toy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public String getToy() {
        return Toy;
    }

    public void setToy(String toy) {
        Toy = toy;
    }

    @Override
    public String toString() {
        return "TaskCollections5{" +
                "nameToy='" + nameToy + '\'' +
                ", Toy='" + Toy + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashMap<String, TaskCollections5> toys = new HashMap<>();
        TaskCollections5 col1 = new TaskCollections5("t1");
        TaskCollections5 col2 = new TaskCollections5("t2");
        TaskCollections5 col3 = new TaskCollections5("t3");
        toys.put("Cat", col1);
        toys.put("Dog", col2);
        toys.put("Bear", col3);
        for(Map.Entry<String, TaskCollections5> s : toys.entrySet()){
            System.out.println(s);
        }
//        System.out.println(toys.keySet());
//        System.out.println(toys.entrySet());
//        System.out.println(toys.values());
        TaskCollections5 col5 = new TaskCollections5("Dog", "dog1");
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put(col5.getNameToy(), col5.getToy());
        System.out.println(hmap.entrySet());


    }
}
