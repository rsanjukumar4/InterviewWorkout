package MapWorkout;



import objectworkout.Employee;
import objectworkout.Mobile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapSample {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("k", new Employee("meena", 28, 24000.00, List.of(new Mobile(23424))));
        map.put("cde", new Employee("sanjay", 30, 21000.00,List.of( new Mobile(23445))));
        map.put("d", new Employee("midhun", 29, 21000.00, List.of(new Mobile(745635))));
//        List<Employee> sortedList = map.values().stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
//        map.entrySet().stream()
//                .sorted(Map.Entry.<String, Employee>comparingByKey())
//                .forEach(System.out::println);

        complexSolution(map);


    }

    private static void complexSolution(Map<String, Employee> map) {
        List<Map.Entry<String,Employee>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Comparator.comparing(entry -> entry.getValue().getName()));

        Map<String,Employee> sortedMap = new LinkedHashMap<>();
        sortedList.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        sortedMap.forEach((key,value) -> System.out.println(key + " : " + value));
    }
}
