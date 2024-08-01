package mphasis;

import java.util.List;

public class StringWorkout {
    public static void main(String[] args) {
        List<String> stringList = List.of("abc", "xyzzy","abc", "yyaa");

        stringList.stream().forEach(System.out::println);
        stringList.forEach(System.out::println);


    }
}
