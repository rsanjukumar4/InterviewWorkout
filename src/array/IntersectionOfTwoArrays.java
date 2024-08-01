package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersectionOfTwoArrays.intersect(nums1,nums2)));

    }


    public int[] intersect(int[] nums1, int[] nums2) {
        int length = nums1.length > nums2.length ? nums1.length : nums2.length;
        Map<Integer,Integer> nums1FrequencyMap = new HashMap<>();
        Map<Integer,Integer> nums2FrequencyMap = new HashMap<>();
        List<Integer> outputList = new ArrayList<>();
        for(int i =0 ;i < length; i++) {
            if(i < nums1.length) {
                buildFrequencyMap(nums1, nums1FrequencyMap, i);
            }
            if(i < nums2.length) {
                buildFrequencyMap(nums2, nums2FrequencyMap, i);
            }
        }
        for(Map.Entry<Integer,Integer> entry : nums1FrequencyMap.entrySet()) {
            if(nums2FrequencyMap.containsKey(entry.getKey())) {
                Integer nums2frequency = nums2FrequencyMap.get(entry.getKey());
                if(nums2frequency < entry.getValue()) {
                    addElements(outputList, entry.getKey(), nums2frequency);
                } else {
                    addElements(outputList, entry.getKey(), entry.getValue());
                }
            }
        }
        int[] resultArray = new int[outputList.size()];
        for(int i=0;i< outputList.size();i++) {
            resultArray[i] = outputList.get(i);
        }
        nums1FrequencyMap = null;
        nums2FrequencyMap = null;
        outputList = null;
        return resultArray;
    }

    private void addElements(List<Integer> outputList, Integer key, Integer nums2frequency) {
        for(int i = 0; i < nums2frequency; i++) {
            outputList.add(key);
        }
    }

    private void buildFrequencyMap(int[] nums, Map<Integer, Integer> frequencyMap, int i) {
        if(frequencyMap.containsKey(nums[i])) {
            frequencyMap.put(nums[i], frequencyMap.get(nums[i]) + 1);
        } else {
            frequencyMap.put(nums[i],1);
        }
    }


//    public int[] intersect(int[] nums1, int[] nums2) {
//        if(nums1.length > nums2.length) {
//            return getCommonValues(nums1,nums2);
//        } else {
//            return getCommonValues(nums2,nums1);
//        }
//    }
//
//    public int[] getCommonValues(int[] storageArray,int[] iterationArray) {
//        Set<Integer> uniqueValues = new HashSet<>();
//        List<Integer> outputList = new ArrayList<>();
//        for(int i =0;i<storageArray.length ; i++) {
//            uniqueValues.add(storageArray[i]);
//        }
//        for(int i =0;i<iterationArray.length ; i++) {
//            if(uniqueValues.contains(iterationArray[i])) {
//                outputList.add(iterationArray[i]);
//            }
//        }
//        int[] resultArray = new int[outputList.size()];
//        for(int i=0;i< outputList.size();i++) {
//            resultArray[i] = outputList.get(i);
//        }
//        outputList = null;
//        uniqueValues = null;
//        return resultArray;
//    }
}
