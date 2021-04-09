package homework.lesson7;

public class Homework7Task1 {
    public static void main(String[] args) {
        int[][] numbers = new int[7][7];

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j <= numbers[i].length - 1; j++) {
                if (i == j) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }
    }
}