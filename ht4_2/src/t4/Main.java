package t4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            list.add(line);
            if (line.equals("end")) {
                break;
            }
        }

        for (String line : list) {
            System.out.println(line);
        }
    }
}
