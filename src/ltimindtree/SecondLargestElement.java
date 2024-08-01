package ltimindtree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,7,9,5,10);
        Integer secondLargestElement = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(secondLargestElement);
    }
}
