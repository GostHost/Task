import com.sun.security.jgss.GSSUtil;

import java.io.*;

public class TaskReader2 {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("a.txt");
             InputStream input = new FileInputStream("a.txt")) {
            char[] symbols = {'a', 'b', 'c'};
            for (char s : symbols) {
                output.write(s);
            }
            int size = input.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) input.read() + " ");
            }
        }
        catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
