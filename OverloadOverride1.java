class OverloadOverride1 {

    // метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // перегрузка метода для сложения двух чисел float
    public double add(double a, double b) {
        return a + b;
    }

    // следующий пример нельзя - т.к. отличается от уже имеющегося только типом возвращаемого значения
    /*
    public double add(int a, int b) {
        return a + b;
    }
     */
    // перегрузка метода для сложения трех целых
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        OverloadOverride1 calc = new OverloadOverride1();

        System.out.println("int1 + int2 " + calc.add(1,2));
        System.out.println("int1 + int2 + in3 " + calc.add(1, 2, 3));
        System.out.println("double1 + double2 " + calc.add(1.2d, 3.4d));
    }
}

//пример overrride
class Num {
    public void print() {
        System.out.println("Num");
    }
}

class Int extends Num {
    @Override // Переопределение родительского метода
    public void print() {
        System.out.println("Int");
    }
}
class Double extends Num {
    @Override // Переопределение родительского метода
    public void print()() {
        System.out.println("Double");
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Num int1 = new Int();
        Num double1 = new Double();

        // Вызов переопределенных методов
        int1.print();  // "Int"
        double1.print();  // "Double"
    }
}