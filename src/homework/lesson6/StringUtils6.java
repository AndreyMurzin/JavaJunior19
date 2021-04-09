package homework.lesson6;

public class StringUtils6 {
    public static String lineSplitting(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        return text;
    }

    public static int sumOfLetters(String text) {
        String newText = text.replaceAll("[ ,.:;!?]", "");
        char[] symbolsInText = newText.toCharArray();
        int numbers0fLetters = 0;
        for (int i = 0; i < symbolsInText.length - 1; i++) {
            numbers0fLetters = numbers0fLetters + symbolsInText[i];
        }
        return symbolsInText.length;
    }


}
