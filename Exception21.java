public class Exception21 {
    public static void main(String[] args) {

        // ArithmeticException - деление на ноль
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        int k = 1/0;  // это не будет обработано - аварийное завершение программы
    }
}
