// Суперкласс
class Parent {
    final void method() {
        System.out.println("Parent");
    }
}

// Подкласс
class Child extends Parent {
    void method() {
        System.out.println("Child"); // ошибка - невозможность переопределить в подклассе final-метод суперкласса
    }
}