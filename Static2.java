interface Interface1 {

    // Неабстрактный метод 
    default void defaultMethod() {
        System.out.println("default method");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("static method");
    }
}

// Класс, реализующий интерфейс
class Class1 implements Interface1 {

    // Переопределяем неабстрактный метод интерфейса
    @Override
    public void defaultMethod() {
        System.out.println("override default method");
    }

    public void thisMethod() {
        // Вызов неабстрактного метода через this
        System.out.print("this...");
        this.defaultMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        Class1 obj = new Class1();

        // Вызов метода интерфейса через экземпляр
        obj.thisMethod(); // Вызывает переопределенный метод defaultMethod()

        // Вызов статического метода интерфейса без создания экземпляра
        Interface1.staticMethod(); // Вызывает статический метод статически

        // Вызов статического метода интерфейса через экземпляр класса
        obj.staticMethod(); // Вызывает статический метод статически
    }
}