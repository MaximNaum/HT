package t1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("example.txt");
            writer.write("штото");
            writer.close();

            FileReader reader = new FileReader("example.txt");

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
