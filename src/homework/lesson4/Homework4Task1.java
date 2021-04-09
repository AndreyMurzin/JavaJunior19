package homework.lesson4;

public class Homework4Task1 {
    public static void main(String[] args) {
        String text = "I have to learn next programming languages: Java, JavaScript, Delphi, Ruby.";

        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ':' || charArray[i] == ',' || charArray[i] == '.') {
                System.out.println(charArray[i]);

            }
        }

    }
}