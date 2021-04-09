package lesson3;

public class Main7 {
    public static void main(String[] args) {
        int sumNumbers = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                sumNumbers = sumNumbers + i;
            }

        }
        System.out.println(sumNumbers);

    }
}
