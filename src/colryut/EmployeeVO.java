package colryut;

public class EmployeeVO {

    private static EmployeeVO employeeVO;

    private EmployeeVO() {

    }

    public static EmployeeVO getInstance() {
        return new EmployeeVO();
    }


    public void hello() {
        System.out.println("hello");
    }
}
