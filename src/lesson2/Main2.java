package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int tour = 40000;
        int salary = 60000;
        int dayTrips = 5;

        if (dayTrips > 7 || tour < salary) {
            System.out.println("Поедем");

        } else {
            System.out.println("Не поедем");
        }
    }
}
