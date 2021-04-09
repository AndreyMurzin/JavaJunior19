package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int [] mass = new int[15];

        mass [0] = 5;
        mass [1] = 10;
        mass [2] = 15;
        mass [3] = 20;
        mass [4] = 25;
        mass [5] = 30;
        mass [6] = 35;
        mass [7] = 40;
        mass [8] = 45;
        mass [9] = 50;
        mass [10] = 55;
        mass [11] = 60;
        mass [12] = 65;
        mass [13] = 70;
        mass [14] = 75;

        int value = 5;
        for (int i = 0; i < 15; i++) {
            mass [i] = value;
            value = value + 5;
        }
    }
}
