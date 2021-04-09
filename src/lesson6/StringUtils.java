package lesson6;

public class StringUtils {
    public static int countWords(String text) {
        //Привет, меня зовут Андрей, а тебя?
        String[] words = text.split(" ");
        return words.length;
    }

    public static void whatsIsFile(String path) {
        if (path.endsWith("png") || path.endsWith("jpg") || path.endsWith("jpeq")) {
            System.out.println("Это картинка!");

        } else if (path.endsWith("muvi") || path.endsWith("mp4")) {
            System.out.println("Это видео!");
        } else if (path.endsWith("exe")) {
            System.out.println("Это программа!");
        } else {
            System.out.println("Это какой то файл");
        }
    }

    public static void reverse(String text) {
        char[] symbolsFromText = text.toCharArray();
        for (int i = symbolsFromText.length - 1; i >= 0; i--) {
            System.out.print(symbolsFromText[i]);
        }
        System.out.println();
    }

    public static void printPoins (String text) {
        char[] countPoins = text.toCharArray();
        for (int i = 0; i < countPoins.length; i++) {
            if (countPoins[i] == '.' || countPoins[i] == ','|| countPoins[i] == '?' || countPoins[i] == '/' ) {
                System.out.println(countPoins[i]);

            };
        }

    }

    public static void replaceFirstWordsSymbolWithUpper (String text) {
        // text = I am programmer
        char [] charsFromText = text.toCharArray();
        System.out.print(Character.toUpperCase(charsFromText[0]));
        for (int i = 1; i < charsFromText.length; i++) {
            System.out.print(charsFromText[i]);
            if (charsFromText[i] == ' ') {
                charsFromText[i + 1] = Character.toUpperCase(charsFromText[i + 1]);

            }

        }

    }
}
