package t3;

@interface Math {
    int num1();
    int num2();
}

public class Main {
    @Math(num1 = 100, num2 = 200)
    public static void mathSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static void main(String[] args) {

        mathSum(8, 9);
    }
}
