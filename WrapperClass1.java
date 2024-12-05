public class WrapperClass1 {
    public static void main(String[] args) {
        // Пример с Integer
        System.out.println("''1234''->" + Integer.decode("1234"));      // 42
        System.out.println("''01234''-> " + Integer.decode("01234")); // 42
        System.out.println(" 0x1B" + Integer.decode("0x1B"));     // 42
        //System.out.println("0.01f" + Integer.decode("0.01f")); - ошибка - не может быть преобразован в int


        // Пример с Short
        System.out.println("Short (десятичное): " + Short.decode("42"));          // 42
        System.out.println("Short (шестнадцатеричное): " + Short.decode("0x2A"));  // 42
        System.out.println("Short (восьмеричное): " + Short.decode("052"));       // 42


        System.out.println(Short.decode("100000")); // Ошибка: 100000 не входит в диапазон short

        // Пример с Long
        System.out.println("Long (десятичное): " + Long.decode("42"));            // 42
        System.out.println("Long (шестнадцатеричное): " + Long.decode("0x2A"));    // 42
        System.out.println("Long (восьмеричное): " + Long.decode("052"));         // 42


        // Пример с Float
        //System.out.println("Float (десятичное): " + Float.decode("42.5"));      // 42.5
        //System.out.println("Float (шестнадцатеричное): " + Float.decode("0x2A")); // Ошибка

        // Пример с Double
        //System.out.println("Double (шестнадцатеричное): " + Double.decode("0x2A")); // Ошибка

    }
}
