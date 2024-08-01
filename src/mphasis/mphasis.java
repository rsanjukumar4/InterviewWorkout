package mphasis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mphasis {
    public static void main(String[] args) {
        List<String> stringList = List.of("Sanjay", "company", "Sanjay", "organisation", "company");
        Map<String, Long> stringMap = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        stringMap.forEach((k,v) -> {
            if(v > 1) {
                System.out.println(k);
            }
        });

    }
    //list <string>
    //duplicate strings

}
