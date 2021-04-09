package homework.lesson3;

public class Homework3Task5 {
    public static void main(String[] args) {

        int[] setOfNumbers = {2, 3, 9, 1, 4, 6, 7, 5, 8};

        int sumNumbers = 0;
        for (int i = 0; i < 9; i++) {
            sumNumbers = sumNumbers + setOfNumbers[i];
        }

        System.out.println(sumNumbers);

    }
}
