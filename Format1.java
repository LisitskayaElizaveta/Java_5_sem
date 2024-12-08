import java.util.Date;
public class Format1 {
    public static void main(String[] args) {
        // спецификатор %d для целого числа
        int int1 = 123;
        System.out.printf("Int %d%n", int1);

        //спецификатор %f для числа с плавающей точкой
        double double1 = 1.2345678;
        System.out.printf("Double %f%n", double1);

        //спецификатор %c для символа
        char char1 = 'A';
        System.out.printf("Char %c%n", char1);

        // спецификатор %b для boolean
        boolean bool1 = true;
        System.out.printf("Boolean %b%n", bool1);

        //спецификатор %t для Date
        Date date1 = new Date();
        System.out.printf("Date %tF%n", date1);
    }
}