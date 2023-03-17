package t2;

public class Main {

    public static void main(String[] args) {

        String text = "Істина - це те, що залишається після того, як ти все забув. І тільки молитва може вирішити справжню проблему людини - недостатність любові.";

        int middleIndex = text.length() / 2;
        String firstHalf = text.substring(0, middleIndex);
        String secondHalf = text.substring(middleIndex);

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}
