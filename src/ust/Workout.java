package ust;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Workout {

//    List<String> cities={"cHeNNai", "muMbai", "deLHI", "muMBai"}
//
//1. Convert each string in camel case , e.g {"Chennai", "Mumbai", "Delhi", "Mumbai"}
//2. Find the occurency of strings , e.g. Chennai-1, Delhi-1, Mumbai-2
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("cHeNNai", "muMbai", "deLHI", "muMBai");
//        List<String> camelCaseList = cities.stream()
//                .map(String::toLowerCase)
//                .map(str -> String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1))
//                .collect(Collectors.toList());
//        System.out.println(camelCaseList);

        TreeMap<String, Long> camelCaseMap = cities.stream()
                .map(String::toLowerCase)
                .map(str -> String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        System.out.println(camelCaseMap);

    }
}
