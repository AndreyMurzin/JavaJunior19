package homework.lesson10;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSideA(2);
        triangle.setSideB(4);
        triangle.setSideC(7);
        triangle.setHeight(5);

        System.out.println("Периметр треугольника: " + triangle.perimetr());
        System.out.println("Площадь треугольника: " + triangle.area());

        Circle circle = new Circle();
        circle.setRadius(4);

        System.out.println("Периметр круга: " + circle.perimetr());
        System.out.println("Площадь круга: " + circle.area());

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(7);
        rectangle.setSideB(6);

        System.out.println("Периметр прямоугольника: " + rectangle.perimetr());
        System.out.println("Площадь прямоугольника: " + rectangle.area());

        Quadrate quadrate = new Quadrate();
        quadrate.setSideA(2);

        System.out.println("Периметр квадрата: " + quadrate.perimetr());
        System.out.println("Площадь квадрата: " + quadrate.area());

        Ellipse ellipse = new Ellipse();
        ellipse.setSemiMajorAxis(4);
        ellipse.setSemiMinorAxis(2);

        System.out.println("Периметр эллипса: " + ellipse.perimetr());
        System.out.println("Площадь эллипса: " + ellipse.area());

    }
}
