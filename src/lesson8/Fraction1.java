package lesson8;

public class Fraction1 {
    private int chislitel;
    private int znamenatel;

    public Fraction1 () {

    }

    public Fraction1(int chislitel, int znamenatel) {
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;

    }

    public void setChislitel(int chislitel) {
        this.chislitel = chislitel;

    }

    public void setZnamenatel(int znamenatel) {
        this.znamenatel = znamenatel;
    }

    public int getChislitel() {
        return this.chislitel;
    }

    public int getZnamenatel() {
        return this.znamenatel;
    }


    public void printInfo() {
        System.out.println(chislitel % znamenatel + " " + chislitel + "/" + znamenatel);

    }
}
