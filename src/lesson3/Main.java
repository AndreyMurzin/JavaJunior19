package lesson3;

public class Main {
    public static void main(String[] args) {
        int mark = 6;

        switch (mark) {
            case 1:
                System.out.println("Ужас!");
                break;
            case 2:
                System.out.println("Неуд!");
                break;
            case 3:
                System.out.println("Не очень!");
                break;
            case 4:
                System.out.println("Нормально!");
                break;
            case 5:
                System.out.println("Отлично!");
                break;
            default:
                System.out.println("Это не оценка!");

        }
    }
}
