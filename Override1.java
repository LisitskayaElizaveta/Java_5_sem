class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // попытка переопределить метод с неправильной сигнатурой:
    // @Override
    // void sounds() { // выдаст ошибку - метод не соответствует методам суперкласса
    //     System.out.println("Dog barks");ы
    // }
}