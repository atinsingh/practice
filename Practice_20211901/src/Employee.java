public class Employee {
    public static final String COMPANY_NAME = "PRAGRA INC";
    private static final double PI = 3.14;
    private static String companyName;
    private String name;
    private int employeeId;

    public Employee() {

    }

    public Employee(String name, int employeeId) {
       ;
        this.name = name;
        this.employeeId = employeeId;
    }

    public double calculateArea(double radius) {
        return PI*radius*radius;
    }
    void printCompany() {
        System.out.println(COMPANY_NAME);
        //System.out.println(companyName);
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
