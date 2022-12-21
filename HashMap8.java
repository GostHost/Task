import java.util.HashMap;

public class HashMap8 {
    //8. Напишите программу на Java, чтобы проверить, содержит ли карта сопоставление для указанного значения
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        if(nums.containsValue("zalupkin")){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
