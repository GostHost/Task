import java.util.HashMap;

public class HashMap12 {
    //12. Напишите программу на Java, чтобы получить коллекционное представление значений, содержащихся в этой карте.
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        System.out.println(nums.values());
    }
}
