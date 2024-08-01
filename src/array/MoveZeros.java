package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = {0,1,0,3,12};
//        System.out.println(Arrays.toString(moveZeros.moveZeroes(nums)));
    }

    public void moveZeroes(int[] nums) {
        List<Integer> integerList = new ArrayList<>();

        for(int i =0; i< nums.length; i++) {
            if(nums[i] == 0) {
                integerList.add(i);
            }
        }

    }
}
