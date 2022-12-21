import java.util.HashMap;

public class HashMap4 {
    //4. Напишите программу на Java, чтобы удалить все сопоставления с карты.
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        System.out.println("Before: " + nums);
        nums.clear();
        System.out.println("After: " + nums);
    }
}
