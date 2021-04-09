package lesson10;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public String toString() {
        return "Собака: " + getAge() + " года";
    }
}


