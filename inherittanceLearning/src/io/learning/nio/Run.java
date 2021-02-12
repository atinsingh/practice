package io.learning.nio;

import io.learning.OfficeWork;

public class Run {
    public static void main(String[] args) {
       Employee employee = new Employee("Hitesh", 1, 50, "Employee","Agila");
       Employee employee2 = new Manager("Prakash", 2, 50, "Manager","Agila",5000);
       Employee employee3 = new CxO("Agila", 2, 50, "CXO","",10000, 1000);

       employee.display();
        System.out.println("------------------------");
        employee2.display();
        System.out.println("--------------------------");
        employee3.display();
    }
}
//anonymous
