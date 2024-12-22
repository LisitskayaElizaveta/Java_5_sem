interface InterfaceA {
    default void method(){
        System.out.println("method from InterfaceA");
    }
}

interface InterfaceB {
    default void method(){
        System.out.println("method from InterfaceB");
    }
}

class ParentClass implements InterfaceA {
    @Override
    public void method() {
        System.out.println("method from ParentClass implements InterfaceA");
    }
}

class ChildClass extends ParentClass implements InterfaceB {
    @Override
    public void method() {
        // Явное указание, какой метод использовать
        super.method(); // Вызов метода из ParentClass (то есть из InterfaceA)
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.method(); // Выведет "Method from InterfaceA"
    }
}