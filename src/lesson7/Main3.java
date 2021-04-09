package lesson7;

public class Main3 {
    public static void main(String[] args) {
        int [] [] numbers1 = {{1, 0, 0},
                              {0, 1, 0},
                              {0, 0, 1}};

        int [] [] numbers2 = {{2, 4, 7},
                              {6, 6, 3},
                              {2, 7, 9}};

        boolean check = MatrixUtils.isSquareMatrix(numbers1);
        System.out.println(check);

        boolean identityMatrix = MatrixUtils.isIdentityMatrix(numbers1);
        System.out.println(identityMatrix);
    }
}
