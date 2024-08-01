package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringDuplicates {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.contains(3);
        set.contains(3);
        //duplicateString();
        int[] val = {5,1,4,5,7,2,4,5};
        // int temp = val[0];
//        for(int i=0;i<val.length;i++){
//            int temp = val[i];
//            for(int j=0;j<val.length;j++) {
//                if (val[i] == temp) {
//                    System.out.println(val[i]);
//                }
//            }
//
//        }

        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<val.length;i++) {
            map.put(val[i],map.getOrDefault(val[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }

    }

    private static void duplicateString() {
        String str = "trustrace";
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(!(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))){
                System.out.println(str.charAt(i));
            }
        }
    }
}
