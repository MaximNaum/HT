package t3;

import java.lang.reflect.Field;

public class Cat extends Animal {

    public Cat(String name, int age, boolean tail) {
        super(name, age, tail);
    }

    public void change() {
        try {
            Field nameField = Animal.class.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(this, "Hank");

            Field ageField = Animal.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(this, 5);

            Field isAliveField = Animal.class.getDeclaredField("tail");
            isAliveField.setAccessible(true);
            isAliveField.setBoolean(this, false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 7, true);
        cat.change();
        System.out.println(cat);
    }
}
