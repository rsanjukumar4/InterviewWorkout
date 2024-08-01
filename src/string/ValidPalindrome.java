package string;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "0P";
        System.out.println(validPalindrome.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        int leftIndex =0;
        int rightIndex = s.length()-1;
        s = s.toLowerCase();
        while (leftIndex < rightIndex) {
            if(!Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
                continue;
            }
            if(s.charAt(leftIndex) == s.charAt(rightIndex)) {
                leftIndex++;
                rightIndex--;
            } else {
                return false;
            }
        }
        return true;
    }

}
