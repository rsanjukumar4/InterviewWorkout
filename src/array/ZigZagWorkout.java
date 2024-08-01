package array;

import java.util.Arrays;

public class ZigZagWorkout {

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // traverse the array from 1 to N -1
        for (int i = 1; i <= arr.length - 2; i += 2) {
            // swap the current element with the next
            // element
            int temp = arr[i];
            System.out.print(temp);
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
