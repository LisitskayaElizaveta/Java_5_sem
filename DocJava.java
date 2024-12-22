/**
 * Класс Calculator представляет простейший калькулятор,
 * который выполняет базовые арифметические операции.
 *
 * @author Елизавета Лисицкая
 * @version 1.0
 */
public class Calculator {

    /**
     * Суммирует два числа.
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Вычитает второе число из первого.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Умножает два числа.
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Делит первое число на второе.
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b
     * @throws ArithmeticException если b равно 0
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return a / b;
    }
}