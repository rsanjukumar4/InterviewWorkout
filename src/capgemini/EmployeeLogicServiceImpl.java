package capgemini;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeLogicServiceImpl {

    public static void main(String[] args) {
        List<EmployeeVO> employeeVOList = List.of(
                new EmployeeVO("abc", 1000,"Java"),
                new EmployeeVO("cde", 5000,"Java"),
                new EmployeeVO("dbc", 3000,"Python"),
                new EmployeeVO("fgh", 2000,"Python"),
                new EmployeeVO("vhi", 16000,"Frontend"),
                new EmployeeVO("iop", 1000,"Frontend")
        );


        employeeVOList.stream()
                .collect(Collectors.groupingBy(EmployeeVO::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(EmployeeVO::getSalary))));

//        Map.Entry<String, Double> stringDoubleEntry = employeeVOList.stream()
//                .collect(Collectors.groupingBy(
//                        EmployeeVO::getDepartment
//
//                ))
//                .entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .get();
//
//        System.out.println(stringDoubleEntry);


        int[] array = {5,2,3,5,3,4};

        Integer secondNonRepeatingCharacter = Arrays.stream(array).boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println(secondNonRepeatingCharacter);



    }
}
