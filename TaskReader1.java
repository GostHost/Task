import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskReader1 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileIn = new FileInputStream("C:\\Users\\Я\\IdeaProjects\\Text.txt");
             FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Я\\IdeaProjects\\Textcopy.txt")){
            int a;
            while ((a = fileIn.read()) != -1){
                fileOut.write(a);
            }
        }
    }
}
