import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TaskFromJavaRush14 {
    //2. Множество всех животных
    //1. Внутри класса Solution создать public static классы Cat, Dog.
    //2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
    //3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
    //4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
    //5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
    //6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
    // Каждое животное с новой строки
    public class Cat {
        public static Set<String> createCat (){
            HashSet<String> cats = new HashSet<>(Set.of("Kot1","Kot2","Kot3","Kot4"));
            return cats;
        }
    }
    public class Dog {
        public static Set<String> createDog(){
            HashSet<String> dogs = new HashSet<>(Set.of("Dog1", "Dog2", "Dog3"));
            return dogs;
        }
    }
    public Set<String> join(){
        Set<String> pets = new HashSet<>();
        pets.addAll(Cat.createCat());
        pets.addAll(Dog.createDog());
        return pets;
    }
    public Set<String> removeCats (){
        Set<String> onlydog = new HashSet<>();
        onlydog.addAll(join());
        onlydog.removeAll(Cat.createCat());
        return onlydog;
    }
    public void printPets (){
        TaskFromJavaRush14 print = new TaskFromJavaRush14();
        print.removeCats();
        for(String s : removeCats()){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        TaskFromJavaRush14 pet = new TaskFromJavaRush14();
        pet.removeCats();
        pet.printPets();
    }
}
