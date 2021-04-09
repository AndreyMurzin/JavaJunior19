package homework.lesson10;

public class Ellipse extends Figurs {

    @Override
    public double perimetr() {
        double firstPartOfTheFormula = Math.PI * (getSemiMajorAxis() + getSemiMinorAxis());
        double secondPartOfTheFormula = Math.pow((getSemiMajorAxis() - getSemiMinorAxis()) / (getSemiMinorAxis() + getSemiMajorAxis()), 2);
        double thirdPartOfTheFormula = Math.sqrt(4 - 3 * secondPartOfTheFormula);
        double i = firstPartOfTheFormula * (1 + (3 * secondPartOfTheFormula) / (10 + thirdPartOfTheFormula));
        return i;
    }

    @Override
    public double area() {
        double i = Math.PI * (getSemiMajorAxis() * getSemiMinorAxis());
        return i;
    }
}
