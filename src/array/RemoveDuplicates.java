package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }

    public int removedDuplicates(int[] nums) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for(int element : nums) {
            uniqueElements.add(element);
        }
        int i =0;
//        for(int value :  uniqueElements) {
//            nums[i++] = value;
//        }
        for(int j=0; j<uniqueElements.size();j++) {
            nums[i++] = uniqueElements.iterator().next();
        }
        System.out.println(Arrays.toString(nums));
        return uniqueElements.size();
    }

    int binarySearch(int[] nums, int low, int high, int val) {
        int length = nums.length;
        int response = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check for lower limit
            if (nums[mid] <= val)
                low = mid + 1;
                // Check for higher limit
            else {
                // Move to higher limit
                response = mid;
                high = mid - 1;
            }
        }
        // Check if not found
        if (response == -1)
            return length;

        return response;
    }

    int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 0; // It store indexing of unique elements.

        while (index != length) {
            int i = binarySearch(nums, index + 1, length - 1, nums[index]); // It finds upper bound of element.

            if (i == length)
                return index + 1; // Means that we are not able to find the upper bound of the element.
            index++;
            nums[index] = nums[i];
        }
        return index + 1;
    }
}
