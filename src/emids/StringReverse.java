package emids;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringReverse {

    public static void main(String[] args) {
        String sentence = "This is a Java Program";
//        stringReverse(sentence);
        Arrays.stream(sentence.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " " + v));


    }

    private static void stringReverse(String sentence) {
        String[] wordArray= sentence.split(" ");
        StringBuilder builder= new StringBuilder();
        for(String word : wordArray) {

            char[] charArray = word.toCharArray();
            int length = charArray.length - 1;
            for(int i=0;i< charArray.length/2;i++) {
                char temp = charArray[i];
                charArray[i] = charArray[length];
                charArray[length] = temp;
                length--;
            }
            builder.append(charArray).append(" ");
        }
        System.out.println(builder.toString());
    }
}
