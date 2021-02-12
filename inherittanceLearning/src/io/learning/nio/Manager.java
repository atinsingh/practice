package io.learning.nio;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int empId, double hourlyRate, String title, String manager, double bonus) {
        super(name, empId, hourlyRate, title, manager);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
