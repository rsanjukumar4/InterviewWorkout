package array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(plusOne.plusOne(nums)));
    }

//    public int[] descendingCase(int[] digits) {
//        int rem = 0;
//        for(int i =digits.length - 1; i >=0 ;i--) {
//            int value = digits[i] + 1;
//            if(value == 10) {
//                rem = 1;
//                digits[i]
//
//            }
//
//        }
//        return digits;
//    }

    public int[] specialCase(int[] digits) {


        StringBuilder builder = new StringBuilder();
        for(int digit : digits) {
            builder.append(digit);
        }
        long largeInteger = Long.parseLong(builder.toString()) + 1;
        String[] digitArray = String.valueOf(largeInteger).split("");
        int[] specialDigits = new int[digitArray.length];
        int i = 0;
        for(String element: digitArray) {
            specialDigits[i++] = Integer.parseInt(element);
        }
        return specialDigits;
    }

//    public int[] plusOne(int[] digits) {
//        int length = digits.length;
//        int lastElementIndex = digits.length - 1;
//        int lastElement = digits[lastElementIndex];
//        if(lastElement == 9) {
//            return descendingCase(digits);
//        } else {
//            int value = lastElement + 1;
//            digits[lastElementIndex] = value;
//            return digits;
//        }
//    }

    public int[] plusOne(int[] digits) {

        for(int i =digits.length - 1; i >=0 ;i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] array= new int[digits.length+1];
        array[0] = 1;
        return array;
    }
}
