import java.util.HashMap;

public class HashMap5 {
    //5. Напишите программу на Java, чтобы проверить, содержит ли карта сопоставления значения ключа (пусто) или нет
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        System.out.println(nums.isEmpty());
    }
}
