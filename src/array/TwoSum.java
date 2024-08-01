package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,3};
        System.out.println(Arrays.toString(twoSum.twoSum(nums,6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        int resultIndex = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                resultArray[resultIndex] = map.get(nums[i]);
                resultArray[resultIndex+1] = i;
                break;
            } else {
                map.put(target - nums[i],i);
            }
        }
        map.clear();
        return resultArray;
    }

    public int[] sortedTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] resultArray = new int[2];
        int resultIndex = 0;
        int sum = 0;
        int  i =0;
        while(i < nums.length) {
            sum = nums[left] + nums[right];
            if(sum == target) {
                resultArray[resultIndex] = left;
                resultArray[resultIndex+1] = right;
                break;
            }
            if(Math.abs(nums[left] + nums[left + 1]) < Math.abs(target)) {
                left++;
            }
            if(Math.abs(nums[right]) > Math.abs(target)) {
                right--;
            }
            i++;
        }

        return resultArray;
    }
}
