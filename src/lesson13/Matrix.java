package lesson13;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        /*
        if (otherMatrix.getColumns() != this.getRows()) {
            System.out.println("Сложение не возможно");
        }
        */
        Matrix matrixAdd = new Matrix(getRows(), getColumns());


        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                int value = 0;
                for (int k = 0; k < value; k++) {
                    value += otherMatrix.getValueAt(i, j) + this.getValueAt(i, j);
                    matrixAdd.add(otherMatrix);
                }
            }
        }
        return matrixAdd;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }

}
