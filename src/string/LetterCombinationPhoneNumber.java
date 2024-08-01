package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationPhoneNumber letterCombinationPhoneNumber = new LetterCombinationPhoneNumber();
        String digits = "23";
        letterCombinationPhoneNumber.letterCombinations(digits);

    }


    public List<String> letterCombinations(String digits) {
        Map<String,List<String>> map = new HashMap<>();
        map.put("2",List.of("a","b","c"));
        map.put("3",List.of("d","e","f"));
        map.put("4",List.of("g","h","i"));
        map.put("5",List.of("a","b","c"));
        map.put("6",List.of("a","b","c"));
        return null;

    }
}
