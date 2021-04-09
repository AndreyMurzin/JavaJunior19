package lesson6;

public class NumbersUtils {
    /**
     * 1 - модификатор доступа
     * public (доступ везде внутри проекта)
     * _________ (достп внутри текущей папки)
     * protected (доступ внутри текущего класса, и его наследниками)
     * private (доступ внутри текущего класса)
     * 2 - static (либо ставим его, либо нет)
     * 3 - возвращаемый тип (или слово void)
     * 4 - название метода всегда с маленькой буквы
     * 5 - входящие параметры в (), или просто () если их нет
     * 6 - тело выполнения метода
     */

    public static int minNum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }

        if (b < a && b < c) {
            return b;
        }

        return c;
    }

    public static String figurs (int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            return "квадрат";

        }
        if (a == b && c == d && a != c) {
            return "прямоугольник";

        }
        return "четырехугольник";
    }

}
