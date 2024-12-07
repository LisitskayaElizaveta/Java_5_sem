public class WrapperClass1 {
    public static void main(String[] args) {
        // Пример с Integer
        System.out.println("Из десятчной системы: " + Integer.decode("123"));
        System.out.println("Из восьмеричной системы: " + Integer.decode("012"));

        // Пример с Byte
        System.out.println("Из шестнадцатиричной: " + Byte.decode("0x1B"));
        System.out.println("Из восьмеричной: " + Byte.decode("012"));
        //при попытки декодировать за пределами определения будет ошибка:
        //System.out.println("Из диапазона за пределами определения: " + Byte.decode("12345"));

        // Пример с Short
        System.out.println("Short: " + Short.decode("123"));

        // Пример с Long
        System.out.println("Long: " + Long.decode("123456"));

    }
}