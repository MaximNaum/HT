package t1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void doubleValues(ArrayList<String> words) {

        for (int i = 0; i < words.size(); i += 2) {
            words.add(i+1, words.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬вед≥ть 5 сл≥в:");

        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        doubleValues(words);

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
