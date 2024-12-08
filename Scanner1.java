import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Scanner1 {
    public static void main(String[] args) {
    try (Scanner scan = new Scanner(new FileReader("C:\\Users\\user\\IdeaProjects\\JavaPractice5Sem\\src\\Arrays1.txt"))) {
        while (scan.hasNextLine()) {                 //считываем следующую строку
            String line = scan.nextLine();
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        System.err.println(e);
    }
}
}
