package homework.lesson1;

public class MyFirstHomework {

    public static void main(String[] args) {
        int money = 1000;
        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        int buyPizza = money / pizza;
        int changeFromPizza = money - pizza * buyPizza;
        int buyGum = changeFromPizza / gum;
        int changeFromPizzaAndGum = money - pizza * buyPizza - gum * buyGum;
        double buyCandy = changeFromPizzaAndGum / candy;
        double change = money - pizza * buyPizza - gum * buyGum - candy * buyCandy;


        System.out.println(buyPizza + " Пиццы");
        System.out.println(buyGum + " Жвачки");
        System.out.println(buyCandy + " Конфет");
        System.out.println("Сдача с магазина: " + change + " рублей");

    }

}
