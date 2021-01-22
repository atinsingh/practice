public class Employee {
    String name;
    int empId;
    boolean status;
    double salary;

    public Employee(String name, int empId, boolean status, double salary) {
        this.name = name;
        this.empId = empId;
        this.status = status;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("---------------------------------");
        System.out.println("Name    " + this.name);
        System.out.println("EmpId   " + this.empId);
        System.out.println("Satus   " +  (status ? "Working ": "Terminated" ));
        System.out.println("Salary  " +  this.salary);
    }

    public void terminate() {
        this.status = false;
    }

    public void incrementSalary(double inc) {
        this.salary = this.salary+inc;
    }
}
