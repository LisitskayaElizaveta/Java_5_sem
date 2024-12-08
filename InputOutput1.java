import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
public class InputOutput1 {
    public static void main(String[] args) {
        try (InputStream file = new FileInputStream("C:\\Users\\user\\IdeaProjects\\JavaPractice5Sem\\src\\Arrays1.txt")) {

            int data = file.read();
            for (int i = 0; i<11; i++){
                System.out.print((char) data);
                data = file.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}