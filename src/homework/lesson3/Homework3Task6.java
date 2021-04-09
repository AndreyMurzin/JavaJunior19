package homework.lesson3;

public class Homework3Task6 {
    public static void main(String[] args) {
        int[] setOfNumbers = {2, 3, 9, 1, 4, 6, 7, 5, 8};

        int sumOfEvenCells = 0;
        for (int i = 0; i < 9; i += 2) {
            sumOfEvenCells = sumOfEvenCells + setOfNumbers[i];

        }

        int sumOfOddCells = 0;
        for (int i = 1; i < 9; i += 2) {
            sumOfOddCells = sumOfOddCells + setOfNumbers[i];

        }
        System.out.println(sumOfEvenCells - sumOfOddCells);


    }
}
