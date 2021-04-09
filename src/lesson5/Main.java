package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону A: ");
        int inputB = scanner.nextInt();

        System.out.println("Введите сторону B: ");
        int inputA = scanner.nextInt();


        int ploshad = inputA * inputB;
        int perimetr = inputA + inputB + inputA + inputB;

        System.out.println("Периметр прямоугольника: " + perimetr);
        System.out.println("Площадь прямоугольника: " + ploshad);


    }
}
