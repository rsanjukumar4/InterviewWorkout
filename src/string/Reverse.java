package string;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        char[] character = {'h','e','l','l','o'};
        reverse.reverseString(character);
    }
    public void reverseString(char[] s) {
        int left =0;
        int right = s.length-1;
        char temp;
        while(left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
        System.out.println(Arrays.toString(s));
    }
}
