package io.learning.nio;

public class CxO extends Manager {
    double incentives;

    public CxO(String name, int empId, double hourlyRate, String title, String manager, double bonus, double incentives) {
        super(name, empId, hourlyRate, title, manager, bonus);
        this.incentives = incentives;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+incentives;
    }
}
