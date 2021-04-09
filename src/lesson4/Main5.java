package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String email = "Dskskm@cmsm.com";

        String[] partsOfEmail = email.split("@");
        System.out.println();

        if (partsOfEmail.length != 2) {
            System.out.println("Email не подходит, неверное количество собачек");
            return;

        }
        if (!partsOfEmail[1].contains(".")) {
            System.out.println("Email не подходит, нет точки!");
            return;

        }
        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Email не подходит. Начинается или заканчивается на точку");
            return;

        }
        String[] partsPerPoint = email.split("\\.");
        String lastPart = partsPerPoint[partsPerPoint.length - 1];
    }
}
