package homework.lesson10;

public class Quadrate extends Figurs {

    @Override
    public double perimetr() {
        double i = 4 * getSideA();
        return i;
    }

    @Override
    public double area() {
        double i = Math.pow(getSideA(), 2);
        return i;
    }
}
