package t2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {

            Class<?> cl = Test.class;

            Field[] fields = cl.getDeclaredFields();
            System.out.println("Fields: ");
            for (Field field : fields) {
                System.out.println(" - " + Modifier.toString(field.getModifiers()) + " "
                        + field.getType().getSimpleName() + " " + field.getName());
            }

            Method[] methods = cl.getDeclaredMethods();
            System.out.println("Methods: ");
            for (Method method : methods) {
                System.out.println(" - " + Modifier.toString(method.getModifiers()) + " "
                        + method.getReturnType().getSimpleName() + " " + method.getName()
                        + "(" + Arrays.toString(method.getParameters()) + ")");
            }

            Constructor<?>[] constructors = cl.getConstructors();
            System.out.println("Constructor: ");
            for (Constructor constructor : constructors) {
                System.out.println(" - " + Modifier.toString(constructor.getModifiers()) + " " + constructor.getName()
                        + " " + Arrays.toString(constructor.getParameters()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
