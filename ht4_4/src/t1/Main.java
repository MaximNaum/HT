package t1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String filePath = "input.txt";
        String content = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content += line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Не вдалось прочитати файл");
            e.printStackTrace();
            return;
        }

        content = content.replaceAll("\\b(?!Java\\b)\\w+\\b", "Java");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        } catch (IOException e) {
            System.out.println("Не вдалось змінити файл");
            e.printStackTrace();
            return;
        }

        System.out.println("Файл йспішно змінено!");
    }
}

