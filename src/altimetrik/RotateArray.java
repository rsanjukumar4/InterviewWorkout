package altimetrik;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotate = 3;


        reverseArray(array,0, array.length);
        reverseArray(array,0,rotate);
        reverseArray(array,rotate, array.length);
        System.out.println(Arrays.toString(array));

    }

    public static void reverseArray(int[] array, int startIndex, int endIndex) {
        int length = endIndex/2;
        for(int i = startIndex; i < length; i++) {
            int x = array[i];
            array[i] = array[endIndex-1];
            array[endIndex-1] = x;
            startIndex++;
            endIndex--;
        }
    }
}

//
//Transaction {
//    boolean isenabled;
//}
//
//transactionlist.stream().filter(transaction -> transaction.isEnabled()).collect(Collectors.toList());