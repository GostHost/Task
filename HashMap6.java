import java.util.HashMap;

public class HashMap6 {
    //6. Напишите программу на Java, чтобы получить поверхностную копию экземпляра HashMap.
    public static void main(String[] args) {
        HashMap<Integer, String> nums = new HashMap<>();
        nums.put(1, "pupkin");
        nums.put(2, "zalupkin");
        nums.put(3, "kozloebov");
        nums.put(4, "barmalei");
        HashMap<Integer, String> numsclone = new HashMap<>();
        numsclone = (HashMap)nums.clone();
        System.out.println(numsclone);
    }
}
