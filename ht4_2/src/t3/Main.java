package t3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("������ ������� ����: ");
        int n = scanner.nextInt();

        HashMap<String, String> list = addFamily(n);

        System.out.println("������ ����� ����: ");
        String city = scanner.next();

        for (String result : list.values()) {
            if (city.equals(result)) {
                System.out.println(); // ��� � ���� �����
            }
        }
    }

    public static HashMap<String, String> addFamily(int n) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> list = new HashMap<>();
        System.out.println("������ " + n + " ���� � �� ���� �����������: ");

        for (int i = 0; i < n; i++) {
            String family = scanner.next();
            String city = scanner.next();
            list.put(city, family);
        }

        return list;
    }
}
