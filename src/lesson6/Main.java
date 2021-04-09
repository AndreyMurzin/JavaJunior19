package lesson6;

public class Main {
    public static void main(String[] args) {
        int result = NumbersUtils.minNum(3, 6, 4);
        System.out.println(result);

        String figura = NumbersUtils.figurs(2 ,2,4,4);
        System.out.println(figura);

        int countWords = StringUtils.countWords("Привет, меня зовут Андрей, а тебя?");
        System.out.println(countWords);

        StringUtils.whatsIsFile("http.png");
        System.out.println();

        StringUtils.reverse("Аэродинамический коэффициент");

        StringUtils.printPoins("Эй ты, да ты, чо как оно?");

        StringUtils.replaceFirstWordsSymbolWithUpper("Привет я программист");
    }
}
