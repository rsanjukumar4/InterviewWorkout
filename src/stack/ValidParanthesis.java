package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        String s = "]";
        System.out.println(validParanthesis.isValid(s));
    }

    public boolean isValid(String s) {

        Deque<Character> characters = new ArrayDeque<>();

        for(int i =0; i<s.length();i++) {
            char c = s.charAt(i);
            if('(' == c || '{' == c || '[' == c) {
                characters.push(c);
                continue;
            }
            if(characters.isEmpty()) {
                return false;
            }
            char character;
            switch (c) {
                case ')' :
                    character = characters.pop();
                    if('{' == character || '[' == character) {
                        return false;
                    }
                    break;
                case '}' :
                    character = characters.pop();
                    if('(' == character || '[' == character) {
                        return false;
                    }
                    break;
                case ']' :
                    character = characters.pop();
                    if('{' == character || '(' == character) {
                        return false;
                    }
                default:
                    break;
            }
        }
        return characters.isEmpty();
    }
// 98.59
    // 60.95
}
