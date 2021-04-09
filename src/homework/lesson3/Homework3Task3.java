package homework.lesson3;

public class Homework3Task3 {
    public static void main(String[] args) {

        int[] setOfNumbers = {2, 3, 9, 1, 4, 6, 7, 5, 8};

        for (int i = 0; i < 9; i++) {
            if (setOfNumbers[i] % 2 == 0) {
                System.out.println(setOfNumbers[i]);
            }
        }
    }
}
