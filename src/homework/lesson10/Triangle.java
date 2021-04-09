package homework.lesson10;

public class Triangle extends Figurs{

    @Override
    public double perimetr() {
        double i = getSideA() + getSideB() + getSideC();
        return i;
    }

    @Override
    public double area() {
        double i = getSideC() * getHeight();
        return i;
    }
}

