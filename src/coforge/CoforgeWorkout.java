package coforge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoforgeWorkout {

    public static void main(String[] args) {
//        input: 2,0,7,1,8,0,2,0,5,3,0
//        output : 2,7,1,8,2,5,3,0,0,0,0
        List<Integer> list = List.of(2,0,7,1,8,0,2,0,5,3,0);
        List<Integer> filteredList = list.stream()
                .filter(value -> value != 0)
                .collect(Collectors.toList());
        int [] array = new int[list.size()];
        for(int i=0 ; i <filteredList.size();i++) {
            array[i] = filteredList.get(i);
        }
        System.out.println(Arrays.toString(array));



    }
}
