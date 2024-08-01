package string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        String s = "loveleetcode";
//        System.out.println(firstUniqueCharacter.firstUniqChar(s));
        System.out.println(firstUniqueCharacter.firstUniqueCharacterOptimised(s));
    }
    public int firstUniqChar(String s) {
        if(s == null || s.length() < 1) {
            return -1;
        }
        if(s.length() == 1) {
            return 0;
        }
        Map<Character,Integer> characterMap = new HashMap<>();
        for(int i=0;i<s.length();i ++) {
            if(characterMap.containsKey(s.charAt(i))) {
                characterMap.put(s.charAt(i),characterMap.get(s.charAt(i)) + 1);
            } else {
                characterMap.put(s.charAt(i),1);
            }
        }
        int i =0;
        while (i<s.length()) {
            if(characterMap.get(s.charAt(i)) == 1) {
                characterMap.clear();
                return i;
            }
            i++;
        }
        return -1;
    }

    public int firstUniqueCharacterOptimised(String s) {
        if(s == null || s.length() < 1) {
            return -1;
        }
        if(s.length() == 1){
            return 0;
        }
        for(int i=0;i<s.length();i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
