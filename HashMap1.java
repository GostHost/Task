import java.util.HashMap;

public class HashMap1 {
    //Напишите программу на Java, чтобы связать указанное значение с указанным ключом в HashMap.
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(5234, "Pupkin Ivan");
        nums.put(5478, "Zalupkin Vasya");
        System.out.println(nums);
    }
}
