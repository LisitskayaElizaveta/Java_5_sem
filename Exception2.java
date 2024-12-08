import java.util.Arrays;
public class Exception2 {

    public static void main(String[] args) {

        // ArithmeticException - деление на ноль
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        // ArrayIndexOutOfBoundsException - обращение за пределы массива
        try {
            int[] num = {1};
            int i = num[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        // IllegalArgumentException - некорректный аргумент
        try {
            int val = Integer.parseInt("abc");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }

        // ClassCastException - неправильное приведение типа
        try {
            Object obj = "ABCD";
            Integer int1 = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        // NullPointerException - вызов методя для null
        try {
            int[] num = null;
            String length = num.toString();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

}