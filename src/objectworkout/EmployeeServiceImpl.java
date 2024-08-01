package objectworkout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl {
    public static void main(String[] args) {

        Employee emp1 = new Employee("abc", 22,34.0,List.of(new Mobile(12334234),new Mobile(123342334)));
        Employee emp2 = new Employee("xyz", 13,3.0,List.of(new Mobile(123342234),new Mobile(123387674)));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);

        Employee employee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .findFirst()
                .orElse(null);

        if(employee != null) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }

//        employeeList.stream()
//                .flatMap(emp -> emp.getMobileList().stream())
//                .map()


    }
}
