package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 5,5);
        Triangle triangle2 = new Triangle(8, 7, 8);
        Triangle triangle3 = new Triangle(2, 3, 7);

/*
        triangle1.setSideA(5);
        triangle1.setSideB(5);
        triangle1.setSideC(5);

        triangle2.setSideA(8);
        triangle2.setSideB(7);
        triangle2.setSideC(8);

        triangle3.setSideA(2);
        triangle3.setSideB(3);
        triangle3.setSideC(7);
*/

        triangle1.printTypeTriangle();
        triangle2.printTypeTriangle();
        triangle3.printTypeTriangle();

    }
}
