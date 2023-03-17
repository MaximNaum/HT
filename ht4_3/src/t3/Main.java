package t3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("text.txt");
            writer.write("тота");
            writer.close();


            FileReader reader = new FileReader("text.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        }
    }
}
