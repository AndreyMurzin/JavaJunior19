package homework.lesson4;

public class Homework4Task3 {
    public static void main(String[] args) {
        String text = "I have to learn next programming languages: Java, JavaScript, Delphi, Ruby.";

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
