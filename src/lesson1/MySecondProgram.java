package lesson1;

public class MySecondProgram {

    public static void main(String[] args) {
        double shirinaRoom = 9.5;
        double dlinaRoom = 5;

        double shirinaTable = 4;
        double dlinaTable = 2.4;

        double ploshadRoom = shirinaRoom * dlinaRoom;
        double ploshadTable = shirinaTable * dlinaTable;

        double tablesToInsertToRoom = ploshadRoom / ploshadTable;

        System.out.println("Столов влезет в комнату: " + tablesToInsertToRoom);

    }
}
