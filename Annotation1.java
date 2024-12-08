/*
// @Override используется для указания, что метод в подклассе переопределяет метод родительского класса

class Parent {
    public void method() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void method() {
        System.out.println("Child");
    }
}

// @Deprecated указывает, что метод(класс или поле) не рекомендуется использовать, и может отсутствовать в следующих версиях
// при использовании такого метода(класса или поля) появляется предупреждение об этом
class Class {
    @Deprecated
    public void Method() {
        System.out.println("Old method");
    }
}

// @SuppressWarnings используется для "отключения" предупреждений компилятора в коде
public class Main {
    @SuppressWarnings("fallthrough") // при отсутсвтии break в case предупреждения не будет
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("1");
            case 0:
                System.out.println(0");
            default:
                System.out.println("default");
        }
    }
}

 */