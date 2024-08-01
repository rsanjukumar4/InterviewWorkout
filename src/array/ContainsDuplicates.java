package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        int[] nums = {1,2,3,2};
        System.out.println(containsDuplicates.containsDuplicate(nums));

    }

    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1) {
            return false;
        }
        Set<Integer> uniqueElements = new HashSet<>();
        for(int element : nums) {
            if(!uniqueElements.add(element)){
                return true;
            }
        }
        return false;
    }
}
