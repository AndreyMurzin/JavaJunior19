package lesson15;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Слива", 5);
        holodilnik.addProduct("Яблоко", 4);
        holodilnik.addProduct("Груша", 9);

        holodilnik.addProduct("Слива", 2);

        holodilnik.printAllProducts();
        holodilnik.getProduct("Яблоко", 4);
        holodilnik.printAllProducts();
        System.out.println();

        Recept recept = new Recept("Пирог", 30);
        recept.addIngridient("Груша", 5);
        recept.addIngridient("Слива", 3);
        recept.printAllIngridients();
        holodilnik.canCookDish(recept);
    }
}
