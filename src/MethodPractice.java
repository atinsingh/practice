import java.util.Scanner;

public class MethodPractice {
    /*
        Method is group of statements, which is defined to do a particular tasks
        ex. forming a greeting, calculating some of two number
        rule of defining identifiers applies to method as well

        Simple task
            - How calculate simple intrest
            -- write a method which calculate simple intrest

     */
    //  optional-optional-type - nameOfMethod ( argument type and idenfier separated by ,  ) { }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Please Enter the principal amount -> : ");
            double p = scanner.nextDouble();
            System.out.printf("Please Enter the roi              -> : ");
            double roi = scanner.nextDouble();
            System.out.printf("Please Enter the Time Frame       -> : ");
            int time = scanner.nextInt();
            System.out.printf("Your interest is                  -> : " + simpleInterestCalculator(p,roi,time)  );
        }

        public static double simpleInterestCalculator(double principal, double roi, int time) {
            return  (principal * roi * time)/100;
        }

}
