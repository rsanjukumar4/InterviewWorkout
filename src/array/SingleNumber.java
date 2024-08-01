package array;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {0,0,1,1,2,2,3,3,4};
        System.out.println(singleNumber.singleNumber(nums));
    }

//    public int singleNumber(int[] nums) {
//        if(nums.length ==1) {
//            return nums[0];
//        }
//        Set<Integer> uniqueElements = new HashSet<>();
//        for(int element : nums) {
//            if(uniqueElements.contains(element)) {
//                uniqueElements.remove(element);
//            } else {
//                uniqueElements.add(element);
//            }
//        }
//        return uniqueElements.iterator().next();
//    }

    public int singleNumber(int[] nums) {
      int[] in={1,2,3,3};
        List<int[]> inlist = Arrays.asList(in);

        Set output= new HashSet<>();
       inlist.stream().filter(x-> !output.add(Arrays.toString(x))).collect(Collectors.toSet());
       return 0;
    }
}
