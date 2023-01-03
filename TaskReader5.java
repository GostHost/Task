import java.io.*;

public class TaskReader5 {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Я\\IdeaProjects\\Text1.txt"));
        BufferedReader bufferderReader = new BufferedReader(new FileReader("C:\\Users\\Я\\IdeaProjects\\Text.txt"))){
            String str;
            while ((str = bufferderReader.readLine()) != null){
                System.out.println(str);
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
