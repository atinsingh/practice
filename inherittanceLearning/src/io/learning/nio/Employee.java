package io.learning.nio;

public class Employee {
    private String name;
    private int empId;
    private double hourlyRate;
    private String title = "Employee";
    private String manager;

    public Employee(String name, int empId, double hourlyRate, String title, String manager) {
        this.name = name;
        this.empId = empId;
        this.hourlyRate = hourlyRate;
        this.title = title;
        this.manager = manager;
    }

    public double calculateSalary() {
        return 21*8*hourlyRate;
    }

    public void display() {
        System.out.println("Employee Name       : " + name);
        System.out.println("Employee Id         : " + empId);
        System.out.println("Employee Salary     : " + calculateSalary());
        System.out.println("Employee title      : " + title);
        System.out.println(title.equals("Employee") || title.equals("Manager")  ? "Employee Manager      : " + manager : "");
    }
}


/*

 */
