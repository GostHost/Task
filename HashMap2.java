import java.util.HashMap;

public class HashMap2 {
    //2. Напишите программу на Java для подсчета количества отображений ключ-значение (размер) на карте
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        System.out.println("Number is " + nums.size());
    }
}
