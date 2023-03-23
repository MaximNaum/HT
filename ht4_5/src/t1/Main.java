package t1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter class name: ");
            String className = scanner.next();

            Class<?> cl = Class.forName(className);

            System.out.println("Class name: " + cl.getName());

            Field[] fields = cl.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(" - " + Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
            }

            Method[] methods = cl.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(" - " + Modifier.toString(method.getModifiers()) + " " + method.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
