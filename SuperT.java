import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}

public class Main {
    public static void addDogToList(List<? super Dog> list) {  //является ли суперкласом
        list.add(new Dog()); // Мы можем добавлять собак
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addDogToList(animals); // Можно передать список животных
        addDogToList(objects);  // Можно передать список объектов
    }
}