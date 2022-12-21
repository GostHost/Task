import java.util.HashMap;

public class HashMap3 {
    //3. Напишите программу на Java, чтобы скопировать все сопоставления с указанной карты на другую карту.
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        HashMap<Integer, String> nums2 = new HashMap<>();
        nums2.putAll(nums);
        System.out.println(nums2);
    }
}
