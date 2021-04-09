package lesson11;

public class Rectangle extends ForSidesFigur {

    private ForSidesFigur forSidesFigur = new ForSidesFigur();

    public Rectangle() {

    }
/*
    public Rectangle(int a, int b) {
        forSidesFigur.setA(a);
        forSidesFigur.setB(b);
        forSidesFigur.setC(a);
        forSidesFigur.setD(b);
    }
    */

    public int perimetr() {
        return forSidesFigur.perimter();
    }

    public double area() {
        return forSidesFigur.area();
    }

}
