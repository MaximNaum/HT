package t2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¬вед≥ть к≥льк≥сть чисел N: ");
        int n = scanner.nextInt();

        LinkedList<Integer> integerList = getIntegerList(n);
        int minimum = getMinimum(integerList);

        System.out.println("Minimum: " + minimum);

    }

    public static LinkedList<Integer> getIntegerList(int n) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> integerList = new LinkedList<>();

        System.out.println("¬вед≥ть " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            integerList.add(number);
        }

        return integerList;
    }

    public static int getMinimum(LinkedList<Integer> integerList) {
        int minimum = Integer.MAX_VALUE;

        for (int number : integerList) {
            if (number < minimum) {
                minimum = number;
            }
        }

        return minimum;
    }
}
