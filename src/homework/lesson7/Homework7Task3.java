package homework.lesson7;

public class Homework7Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][7];

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i <= j) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}


