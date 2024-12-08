public class Exception31 {
    public static void main(String[] args) {
        // Обработка нескольких исключений
        try {
            int result = 1 / 0;
            int[] num = null;
            String array = num.toString();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception");
        }

        // RuntimeException -> IndexOutOfBoundsException -> ArrayIndexOutOfBoundsException
        try {
            int[] num = null;
            System.out.println(num[5]); // Runtime

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }
}
