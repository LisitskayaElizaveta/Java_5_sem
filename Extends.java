
import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Main {
    public static void printAnimals(List<? extends Animal> animals) {  // проверка - является ли подтипом animals
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        printAnimals(dogs); // Можно передать список собак
        printAnimals(cats); // Можно передать список котов
    }
}