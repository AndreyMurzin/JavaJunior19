package lesson4;

public class Main3 {
    public static void main(String[] args) {
        char[] symbols = {'e', 'w', 'q', 'r', 't', 'u', 'o', 'a'};
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 'e' || symbols[i] == 'u' || symbols[i] == 'o' || symbols[i] == 'a') {
                System.out.println(symbols[i]);

            }
        }
    }
}
