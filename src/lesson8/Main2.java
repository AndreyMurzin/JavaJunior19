package lesson8;

public class Main2 {
    public static void main(String[] args) {
        Fraction number1 = new Fraction(1, 2);
        Fraction number2 = new Fraction(2, 5);

        Fraction1 number3 = new Fraction1(1,2);
        Fraction1 number4 = new Fraction1(2,5);

        number1.printInfo();
        number2.printInfo();

        Fraction resultAdd = Calculator.sum(number1, number2);
        resultAdd.printInfo();

        Fraction result2Add = Calculator.difference(number1, number2);
        result2Add.printInfo();

        Fraction result3Add = Calculator.multiplication(number1, number2);
        result3Add.printInfo();

        Fraction1 result4Add = Calculator.division(number3, number4);
        result4Add.printInfo();

    }
}
