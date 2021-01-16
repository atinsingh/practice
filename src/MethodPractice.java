import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
      Employee emp1 = new Employee("VG",1, true, 10000);

      emp1.printDetails();
      emp1.incrementSalary(1000);
      emp1.printDetails();

      emp1.terminate();

      emp1.printDetails();


    }
}
