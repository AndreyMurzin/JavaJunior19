package homework.lesson10;

public class Circle extends Figurs {

    @Override
    public double perimetr() {
        double i = 2 * Math.PI * getRadius();
        return i;
    }

    @Override
    public double area() {
        double i = 2 * Math.PI * (getRadius() * getRadius());
        return i;
    }
}
