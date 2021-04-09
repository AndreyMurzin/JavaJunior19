package lesson13;

public class Main1 {

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);

        matrix1.setValueAt(0,0,1);
        matrix1.setValueAt(0,1,1);
        matrix1.setValueAt(0,2,1);

        matrix1.setValueAt(1,0,1);
        matrix1.setValueAt(1,1,1);
        matrix1.setValueAt(1,2,1);

        matrix1.setValueAt(2,0,1);
        matrix1.setValueAt(2,1,1);
        matrix1.setValueAt(2,2,1);

        matrix2.setValueAt(0,0,2);
        matrix2.setValueAt(0,1,2);
        matrix2.setValueAt(0,2,2);

        matrix2.setValueAt(1,0,2);
        matrix2.setValueAt(1,1,2);
        matrix2.setValueAt(1,2,2);

        matrix2.setValueAt(2,0,2);
        matrix2.setValueAt(2,1,2);
        matrix2.setValueAt(2,2,2);

        matrix1.add(matrix2);





    }
}
