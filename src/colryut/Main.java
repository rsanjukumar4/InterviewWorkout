package colryut;

import capgemini.EmployeeVO;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

//        EmployeeVO employeeVO = new EmployeeVO("san",234,"it");
//        EmployeeVO employeeVO1 = new EmployeeVO();
//        employeeVO1.set
        // literal pool
        String str = "hello";
        String str1 = str;
        String str2 = new String("hello");
        if(str2 == str1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // list of string "sanjay" nirmal sanjay arun arun
//        List<String> duplicateList = List.of("sanjay","nirmal","sanjay","arun","arun");
//        TreeMap<String, Long> duplicateMap = duplicateList.stream()
//                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
//        System.out.println(duplicateMap);

        // list of integer 1,3,5,7
        // 8,2,1,5,4

        List<Integer> list1 = List.of(1,3,5,7);
        List<Integer> list2 = List.of(8,2,1,5,4);
        Set<Integer> uniqueSet = new TreeSet<>();
        uniqueSet.addAll(list1);
        uniqueSet.addAll(list2);
        System.out.println(uniqueSet);





    }
}