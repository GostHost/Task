import java.util.HashMap;

public class HashMap10 {
    //10. Напишите программу на Java, чтобы получить значение указанного ключа на карте.
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        System.out.println(nums.get(2));
    }
}
