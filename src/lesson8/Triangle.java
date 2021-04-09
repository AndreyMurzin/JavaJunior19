package lesson8;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void printTypeTriangle() {
        if (sideA == sideB && sideB == sideC) {
            System.out.println("Равносторонний треугольник");
        } else if (sideA != sideB && sideB != sideC && sideA != sideC) {
            System.out.println("Разносторонний треугольник");
        } else {
            System.out.println("Равнобедренный треугольник");
        }
    }

}
