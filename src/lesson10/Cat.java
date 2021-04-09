package lesson10;

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Мяу мяу");
    }

    @Override
    public String toString() {
        return "Кот: " + getAge() + " года";
    }

}
