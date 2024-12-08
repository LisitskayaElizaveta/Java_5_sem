import java.lang.Object;
import java.util.StringJoiner;
public class String2 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("!"); //StrinJoiner с разделителем !

        joiner.add("A");  // Добавляем A
        joiner.add("B");
        joiner.add("С");

        System.out.println(joiner.toString());

        String text = new StringJoiner(".", "[", "]") // динамическое создание IP адреса
                .add("192")
                .add("168")
                .add("2")
                .add("81").toString();
        System.out.println("IP address: " + text);
    }
}