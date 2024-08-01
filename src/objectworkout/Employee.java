package objectworkout;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private Double salary;

    private List<Mobile> mobileList;

    public Employee(String name, int age, Double salary, List<Mobile> mobileList) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobileList = mobileList;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Mobile> getMobileList() {
        return mobileList;
    }

    public void setMobileList(List<Mobile> mobileList) {
        this.mobileList = mobileList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", mobileList=" + mobileList +
                '}';
    }
}
