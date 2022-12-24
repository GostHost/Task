import java.util.ArrayList;
import java.util.Collection;

public class TaskFromJavaRush18 {
    //6. Вся семья в сборе
    //1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
    //2. Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
    //3. Вывести все объекты Human на экран.
    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        @Override
        public String toString() {
                 String text = "";
                 if(sex == true){
            text =
                    "name='" + name + '\'' +
                            ", sex= male" +
                            ", age=" + age +
                            ", children=" + children +
                            '}';}
                 else text =
                         "name='" + name + '\'' +
                                 ", sex= female" +
                                 ", age=" + age +
                                 ", children=" + children +
                                 '}';
            return text;
        }

        public static void main(String[] args) {
         ArrayList<Human> children = new ArrayList<>();
         ArrayList<Human> parents = new ArrayList<>();
         ArrayList<Human> grands = new ArrayList<>();

         Human child1 = new Human ("child1", true, 5);
         Human child2 = new Human ("child2", false, 1);
         Human child3 = new Human ("child3", true, 12);

         children.add(child1);
         children.add(child2);
         children.add(child3);

         Human father = new Human ("father", true, 40, children);
         Human mother = new Human ("mother", false, 35, children);

         parents.add(father);
         parents.add(mother);

         Human grandfather1 = new Human ("grandfather1", true, 70, parents);
         Human grandfather2 = new Human ("grandfather2", true, 69, parents);
         Human grandmother1 = new Human ("grandmother1", false, 65, parents);
         Human grandmother2 = new Human ("grandmother2", false, 64, parents);

            System.out.println(child1);
            System.out.println(child2);
            System.out.println(child3);
            System.out.println(father);
            System.out.println(mother);
            System.out.println(grandmother1);
            System.out.println(grandmother2);
            System.out.println(grandfather1);
            System.out.println(grandfather2);

        }

    }
}
