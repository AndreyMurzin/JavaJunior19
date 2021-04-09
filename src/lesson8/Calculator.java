package lesson8;

public class Calculator {
    public static Fraction sum(Fraction drob1, Fraction drob2) {
        int commonZnamenatel = drob1.getZnamenatel() * drob2.getZnamenatel();
        int commonChislitel = drob1.getChislitel() * drob2.getZnamenatel() + drob2.getChislitel() * drob1.getZnamenatel();

        Fraction result = new Fraction(commonChislitel, commonZnamenatel);
        return result;

    }

    public static Fraction difference(Fraction drob1, Fraction drob2) {
        int commonZnamenatel2 = drob1.getZnamenatel() * drob2.getZnamenatel();
        int commonChislitel2 = drob1.getChislitel() * drob2.getZnamenatel() - drob2.getChislitel() * drob1.getZnamenatel();

        Fraction result2 = new Fraction(commonChislitel2, commonZnamenatel2);
        return result2;

    }

    public static Fraction multiplication(Fraction drob1, Fraction drob2) {
        int commonZnamenatel3 = drob1.getZnamenatel() * drob2.getZnamenatel();
        int commonChislitel3 = drob1.getChislitel() * drob2.getChislitel();

        for (int i = commonChislitel3; i >= 1; i--) {
            if (commonChislitel3 % i == 0 && commonZnamenatel3 % i == 0) {
                commonChislitel3 /= i;
                commonZnamenatel3 /= i;
            }
        }

        Fraction result3 = new Fraction(commonChislitel3, commonZnamenatel3);
        return result3;
    }

    public static Fraction1 division(Fraction1 drob1, Fraction1 drob2) {
        int commonZnamenatel4 = drob1.getZnamenatel() * drob2.getChislitel();
        int commonChislitel4 = drob1.getChislitel() * drob2.getZnamenatel();

        for (int i = commonZnamenatel4; i >= 1; i--) {
            if (commonChislitel4 % i == 1 && commonZnamenatel4 % i == 0) {
                commonChislitel4 = commonChislitel4 % i;
            }
        }

        Fraction1 result4 = new Fraction1(commonChislitel4, commonZnamenatel4);

        return result4;

    }
}

