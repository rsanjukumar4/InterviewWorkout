package ltimindtree;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

class Employee {

    String name;

    String location;

    int salary;

    Employee(String name, String location, int salary) {

        this.name = name;

        this.location = location;

        this.salary = salary;

    }

    public String getName() {

        return name;

    }

    public String getLocation() {

        return location;

    }

    public int getSalary() {

        return salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeFilter {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", "Pune", 60000));

        employees.add(new Employee("Jane Smith", "Mumbai", 55000));

        employees.add(new Employee("Emily Davis", "Pune", 45000));

        employees.add(new Employee("Michael Brown", "Pune", 70000));
        
        

//TODO 

//Find the name of employees whose location is Pune And salary is greater than or equal to 50000.
        List<String> employeeList = employees.stream()
                .filter(employee -> "Pune".equals(employee.getLocation()) &&
                        employee.getSalary() >= 50000 &&
                        employee.getName().startsWith("M")
                )
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeeList);


    }

}

 
