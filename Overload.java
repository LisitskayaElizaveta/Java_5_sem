public class Overload {
        // Метод для сложения двух чисел
        public int add(int a, int b) {
            return a + b;
        }

        // Метод для сложения трех чисел
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Метод для сложения произвольного числа целых чисел с использованием varargs
        public int add(int... numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }

        public static void main(String[] args) {
            Overload calculator = new Overload();

            // Вызов методов
            System.out.println("Сумма 2 и 3: " + calculator.add(2, 3)); // Вызовет метод add(int a, int b)
            System.out.println("Сумма 1, 2 и 3: " + calculator.add(1, 2, 3)); // Вызовет метод add(int a, int b, int c)
            System.out.println("Сумма 1, 2, 3, 4 и 5: " + calculator.add(1, 2, 3, 4, 5)); // Вызовет метод add(int... numbers)
        }
    }

