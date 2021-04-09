package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Option option1 = new Option("in", true);
        Option option2 = new Option("by", false);
        Option option3 = new Option("on", false);
        Option option4 = new Option("at", false);
        Option option5 = new Option("don't", false);
        Option option6 = new Option("not", false);
        Option option7 = new Option("doesn't", true);
        Option option8 = new Option("no", false);

        Question firstQuestion = new Question("My grandmother started work … 1960");
        firstQuestion.addOptionToQuestion(option1);
        firstQuestion.addOptionToQuestion(option2);
        firstQuestion.addOptionToQuestion(option3);
        firstQuestion.addOptionToQuestion(option4);

        Question secondQuestoin = new Question("She … like football");
        secondQuestoin.addOptionToQuestion(option5);
        secondQuestoin.addOptionToQuestion(option6);
        secondQuestoin.addOptionToQuestion(option7);
        secondQuestoin.addOptionToQuestion(option8);

        Test test1 = new Test();
        test1.setImage("http://easy-it-courses.com/resources/images/tests/icons/Test1.png");
        test1.setNameTest("Тест \"Определите уровень английского языка\"");
        test1.setDescription("Вы хотите выбрать для себя подходящую профессию в IT сфере, но не знаете с чего лучше начать?" +
                "\n" +
                "Специально разработанный тест от EasyIT поможет Вам разобраться, подходит ли Вам профессия «Тестировщик», исходя из Ваших личностных качеств, умений и навыков" +
                "\n" +
                "Желаем Вам успехов!");
        test1.addQuestionToTest(firstQuestion);
        test1.addQuestionToTest(secondQuestoin);

        Scanner scanner = new Scanner(System.in);
        System.out.println(test1.getNameTest());

        firstQuestion.printToCansole();
        System.out.println("Введите Ваш ответ:");
        int answer1 = scanner.nextInt();

        secondQuestoin.printToCansole();
        System.out.println("Введите Ваш ответ:");
        int answer2 = scanner.nextInt();

        boolean isTrue = true;
        for (int i = 0; i < firstQuestion.getOptions().length; i++) {
            if (firstQuestion.getOptions()[i].isTrue()) {
                if (i == answer1) {
                    System.out.println("Первый вопрос правильный");
                    isTrue = false;

                }
            }
        }
        if (isTrue) {
            System.out.println("Первый вопрос неверный");

        }

        boolean isTrue2 = true;
        for (int i = 0; i < firstQuestion.getOptions().length; i++) {
            if (firstQuestion.getOptions()[i].isTrue()) {
                if (i == answer2) {
                    System.out.println("Второй вопрос правильный");
                    isTrue = false;

                }
            }
        }
        if (isTrue2) {
            System.out.println("Второй вопрос неверный");

        }
    }
}
