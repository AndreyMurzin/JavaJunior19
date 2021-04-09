package homework.lesson2;

public class Homework2Task2 {
    public static void main(String[] args) {
        // Заданы 5 чисел:
        int firstNumber = -11;
        int secondNumber = 2;
        int thirdNumber = 1;
        int fourthNumber = -9;
        int fifthNumber = 0;

        if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber) {
            System.out.println(firstNumber); // Вывод на экран меньшего числа;

        } else if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber) {
            System.out.println(secondNumber); // Вывод на экран меньшего числа;

        } else if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber) {
            System.out.println(thirdNumber); // Вывод на экран меньшего числа;

        } else if (fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber) {
            System.out.println(fourthNumber); // Вывод на экран меньшего числа;

        } else if (fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber) {
            System.out.println(fifthNumber); // Вывод на экран меньшего числа;
        }


    }
}
