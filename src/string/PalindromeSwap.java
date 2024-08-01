package string;

public class PalindromeSwap {
    public static int minSwaps(String str) {
        int left = 0, right = str.length() - 1, swaps = 0;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                swaps++;
                // Swap the characters at the two pointers
                char temp = str.charAt(left);
                str = str.substring(0, left) + str.charAt(right) + str.substring(left + 1, right) + temp + str.substring(right + 1);
            }
            left++;
            right--;
        }
        System.out.println(str);
        return swaps;
    }

    public static void main(String[] args) {
        String str = "aabb";
        int swaps = minSwaps(str);
        System.out.println("Minimum number of swaps required to make the string a palindrome: " + swaps);
    }
}
