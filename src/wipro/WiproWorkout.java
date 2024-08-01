package wipro;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WiproWorkout {
    public static void main(String[] args) {
        int i = 12345;
        int sum = 0;
        Integer summedValue = Arrays.stream(String.valueOf(i).split(""))
                .mapToInt(value -> Integer.parseInt(value))
                .sum();
        System.out.println(summedValue);
//        while (i > 0 ) {
//            int y = i%10;
//            i = i/10;
//            sum = sum + y;
//        }
//        System.out.println(sum);
//        // Integer i = 12345 summation of digits

         String name = "my name is sanjay";
        char[] charArray = name.toCharArray();


        Map<Character, Long> map = name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        map.forEach((k,v) -> System.out.println(k + " " + v));
        int[] intArray = {};
        Arrays.stream(intArray).boxed();
//
//        Set<Character> set = new HashSet<>();
//        for(int i=0; i< name.length() ; i++) {
//            if(!set.add(name.charAt(i))) {
//                System.out.println(name.charAt(i));
//                break;
//            }
//        }
    }
}
