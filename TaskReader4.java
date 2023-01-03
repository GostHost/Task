import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskReader4 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Я\\IdeaProjects\\Text.txt"))){
            String str;
            while((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
