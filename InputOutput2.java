import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
public class InputOutput2 {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("output.txt", true)) {
            output.write(1234);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}