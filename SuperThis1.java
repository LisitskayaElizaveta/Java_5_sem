class Parent {
    // поле, метод, конструктор
    int a;
    void method()
    Parent() {}

}

class Child extends Parent {
    int a;
    void method()
    Child() { // вызов через super поля, метода и конструктора родительского класса
        super();
        super.a = 123;
        super.method();
    }
}  