package lesson14;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("qqq");
        strings.add("eee");
        strings.add("ttt");
        strings.add("uuu");
        strings.add("qqq");
        strings.add("qqq");

        System.out.println(strings);


    }
}
