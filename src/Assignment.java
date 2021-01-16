import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            printMenu();
            choice = Integer.parseInt(scanner.next());

            switch (choice) {
                case 0: {
                    System.out.println("Thank you for using Simple calculator");
                    System.out.println("Good Bye....");
                }break;
                case 1 : {
                    System.out.println("Enter two number separated by space");
                    int num1 = Integer.parseInt(scanner.next());
                    int num2 = Integer.parseInt(scanner.next());
                    System.out.println( sum(num1, num2) );
                }break;
                case 2 : {
                    System.out.println("Enter two number separated by space");
                    int num1 = Integer.parseInt(scanner.next());
                    int num2 = Integer.parseInt(scanner.next());
                    System.out.println( substraction(num1, num2) );
                }break;
                case 3 : {
                    System.out.println("Enter two number separated by space");
                    int num1 = Integer.parseInt(scanner.next());
                    int num2 = Integer.parseInt(scanner.next());
                    System.out.println( multiplu(num1, num2) );
                }break;
                default: {
                    System.out.println("Not a valid choice");
                }
            }
        }
    }


    private static void printMenu() {
        System.out.println("-------------- PROGRAM MENU ------------");
        System.out.println("Press 1 for  Addition");
        System.out.println("Press 2 for  Substraction");
        System.out.println("Press 3 for  Multilication");
        System.out.println("Press 0 for exit");
        System.out.printf("Key in your choice");
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int substraction(int a, int b) {
        return a-b;
    }
    public static int multiplu(int a, int b) {
        return a*b;
    }
}
