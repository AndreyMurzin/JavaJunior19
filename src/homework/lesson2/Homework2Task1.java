package homework.lesson2;

public class Homework2Task1 {
    public static void main(String[] args) {
        //Заданы четыре стороны четырехугольника:
        int a = 2;
        int b = 6;
        int c = 9;
        int d = 2;

        if (a == b && b == c && c == d) {
            System.out.println("Квадрат");

        } else if ((a == b && c == d && a != c) || (a == c && b == d && a != b) || (a == d && b == c && a != b)) {
            System.out.println("Прямоугольник");

        } else
            System.out.println("Разносторонний четырехугольник");
    }
}
