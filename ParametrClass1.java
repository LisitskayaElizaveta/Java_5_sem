public class ParametrClass1<T> {      //параметризованный класс
    private T value;

    public ParametrClass1(T value) {
        this.value = value;
    }
}

public class Main {
        public static void main(String[] args) {
            // Создание объектов Box с различными типами
            ParametrClass1<Integer> integer1 = new ParametrClass1<>(123);
            ParametrClass1<String> string1 = new ParametrClass1<String>("ABCD");

            // использование instanceof
            if (integer1 instanceof ParametrClass1) {
                System.out.println("integer1 создан на основе параметризованного класса");
            }

            if (string1 instanceof ParametrClass1) {
                System.out.println("string1 создан на основе параметризованного класса");
            }

        }
    }

