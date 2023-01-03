import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TaskReader3 {
    public static void main(String[] args) {
        try (FileReader rw = new FileReader("C:\\Users\\Я\\IdeaProjects\\Example.txt");
        FileWriter ww = new FileWriter("C:\\Users\\Я\\IdeaProjects\\Examcopy.txt")){
          char [] symbols = new char[50];
          rw.read(symbols);
            System.out.println(Arrays.toString(symbols));
          ww.write(symbols);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
