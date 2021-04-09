package homework.lesson10;

public class Rectangle extends Figurs{

    @Override
    public double perimetr() {
        double i = 2 * (getSideA() + getSideB());
        return i;
    }

    @Override
    public double area() {
        double i = getSideA() * getSideB();
        return i;
    }
}
