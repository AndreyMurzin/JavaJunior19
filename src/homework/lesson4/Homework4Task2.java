package homework.lesson4;

public class Homework4Task2 {
    public static void main(String[] args) {
        String text = "I have to learn next programming languages: Java, JavaScript, Delphi, Ruby.";

        String newText = text.replaceAll("[Iaeoiuy]" , "?");
        System.out.println(newText);
    }
}
