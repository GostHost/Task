import java.util.HashMap;
import java.util.Set;

public class HashMap9 {
    //9. Напишите программу на Java для создания набора представлений отображений, содержащихся в карте
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        Set set = nums.entrySet();
        System.out.println(set);
    }
}
