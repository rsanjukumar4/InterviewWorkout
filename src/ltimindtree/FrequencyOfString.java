package ltimindtree;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {
    public static void main(String[] args) {
        List<String> stationaryList=
                Arrays.asList("Pen","Eraser","Note Book","Pen","Eraser","Pen");
        stationaryList.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(map -> System.out.println(map.getKey() + " " + map.getValue()));


        int[] array = {0, 4, 6, 0, 0, 7, 0, 9, 1, 0};
//        output: [4, 6, 7, 9, 1, 0, 0, 0, 0, 0]

        int[] newArray = new int[array.length];
        int j = 0;
        for(int i=0;i< array.length;i++) {
            if(array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newArray));


    }
}
