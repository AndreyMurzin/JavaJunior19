package lesson15;

import java.util.HashMap;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeigth = products.get(product);
            products.put(product, weight + currentWeigth);
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts() {
        for (String key : products.keySet()) {
            System.out.println(key + " - " + products.get(key));
        }
    }

    public void getProduct(String product, int weigth) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодидьнике нет");
            return;
        }
        if (products.get(product) == weigth) {
            products.remove(product);
            return;
        }
        if (products.get(product) < weigth) {
            System.out.println("Вы хотите достать больше, чем есть в холодильнике");
            return;
        }
        products.put(product, products.get(product) - weigth);
    }

    public void canCookDish(Recept recept) {
        for (String ingridient : recept.getIngridients().keySet()) {
            if (!products.containsKey(ingridient)) {
                System.out.println("Нет ингридиента " + ingridient);
                return;
            }
        }
        for (String ingridient:recept.getIngridients().keySet()) {
            if (products.get(ingridient) < recept.getIngridients().get(ingridient)) {
                System.out.println("Не хватает " + ingridient + ", требуется больше, чем есть");
                return;
            }
        }
        System.out.println("Такое блюдо можно приготовить!");
    }


}
