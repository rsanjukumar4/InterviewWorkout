package string;

import java.util.ArrayList;
import java.util.List;

public class ThreePalindromeSubstrings {
    public static void main(String[] args) {
        ThreePalindromeSubstrings threePalindromeSubstrings = new ThreePalindromeSubstrings();
        String s = "madamciviclevel";
        System.out.println(threePalindromeSubstrings.threePalindromicSubstrings(s));
    }

    public List<String> threePalindromicSubstrings(String word) {
        List<String> outputList = new ArrayList<>();
        for(int i=0;i<word.length();i++) {
            int endIndex = word.lastIndexOf(word.charAt(i));
            int beginIndex = word.indexOf(word.charAt(i));
            if(beginIndex == endIndex) {
                break;
            }
            if(isPalindrome(word.substring(beginIndex, endIndex + 1))) {
                outputList.add(word.substring(beginIndex, endIndex +1));
            }
            i = endIndex;
        }
        if(outputList.size() < 3 ) {
            outputList.clear();
            outputList.add("Impossible");
        }
        return outputList;
    }

    public boolean isPalindrome(String s) {
        int leftIndex =0;
        int rightIndex = s.length()-1;
        s = s.toLowerCase();
        while (leftIndex < rightIndex) {
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
