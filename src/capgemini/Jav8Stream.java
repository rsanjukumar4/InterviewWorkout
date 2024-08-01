package capgemini;

import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Jav8Stream {

    //listemployees id, name salary sort based on salary

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1, "sanjay",2400,23),
                new Employee(2, "xyz",2344,34),
                new Employee(3, "sanjay",9874,56)
        );


//        employeeList.stream()
//                .filter(employee -> "sanjay".equals(employee.getName()))
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                        .forEach(employee ->  {
//                            System.out.println(employee.getName() + " " + employee.getSalary());
//                        });
//

        List<EmployeeVO> employeeVOList = List.of(
                new EmployeeVO("abc", 1000,"Java"),
                new EmployeeVO("cde", 5000,"Java"),
                new EmployeeVO("dbc", 3000,"Python"),
                new EmployeeVO("fgh", 2000,"Python"),
                new EmployeeVO("vhi", 16000,"Frontend"),
                new EmployeeVO("iop", 1000,"Frontend")
        );
//
//        Map<String, Optional<EmployeeVO>> highestSalariesByDept = employeeVOList.stream()
//                .collect(Collectors.groupingBy(EmployeeVO::getDepartment,
//                        Collectors.maxBy(Comparator.comparingDouble(EmployeeVO::getSalary))));
//
//        employeeVOList.stream()
//                .collect(Collectors.groupingBy(EmployeeVO::getDepartment,
//                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(EmployeeVO::getSalary))));
////
////        employeeVOList.stream()
////                .collect(Collectors.groupingBy(EmployeeVO::getDepartment)
////                        );
//
//
//


    }

}

