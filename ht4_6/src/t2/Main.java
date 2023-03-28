package t2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface AnimalAnnotation {
    String name();
    int age();
}

@AnimalAnnotation(name = "Animal", age = 0)
class Animal {
    public void speak() {
        System.out.println("The animal speaks.");
    }
}

@AnimalAnnotation(name = "Dog", age = 3)
class Dog extends Animal {
    @Deprecated
    public void bark() {
        System.out.println("The dog barks.");
    }

    @SuppressWarnings("unused")
    public void fetch() {
        System.out.println("The dog fetches.");
    }
}

@FunctionalInterface
interface AnimalAction {
    void perform(Animal animal);
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Name: " + dog.getClass().getAnnotation(AnimalAnnotation.class).name());
        System.out.println("Age: " + dog.getClass().getAnnotation(AnimalAnnotation.class).age());
        dog.speak();
        dog.bark();
        dog.fetch();

        AnimalAction action = Animal::speak;
        action.perform(dog);
    }
}
