import java.util.Arrays;
import java.util.Scanner;

public class Array2DPractice {
    public static void main(String[] args) {
        int [] [] ints2d = new int [2] [3];

        ints2d [0][0] = 100;
        ints2d [0][1] = 200;
        ints2d [0][2] = 300;

        ints2d [1][0] = 400;
        ints2d [1][1] = 500;
        ints2d [1][2] = 600;
        int [][] array =  { {1,4,5,6} , {3,7,2,6}, {23,42,4,34} ,{21,35,56,63} };
        int finalSum =0;

        for (int i = 0; i < array.length ; i++) {
            int localSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                localSum = localSum + array[i][j];
            }
            System.out.println( "Sum of Array " + Arrays.toString(array[i]) + " =  "+ localSum   );
            finalSum = finalSum+ localSum;
        }
        System.out.println("Total Sum  = " + finalSum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry the size of An array");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size ; i++){
            System.out.println("Enter Number");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Actual Array = " + Arrays.toString(arr));
        System.out.println("Reversed Array = " + Arrays.toString(reverse(arr)));
    }

    //  resverArray[0] = arr[3]
    // resverArray[1] = arr[2]
    //resverArray[2] = arr[1]
    // resverArray[3] = arr[0]
    public static int [] reverse(int [] arr) {
        int [] reversedArray = new int[arr.length];
        //{0,2,5,6} =={6,5,2,0}
        for (int i = 0; i < arr.length ; i++) {
            reversedArray[i]  = arr[arr.length-1-i];
        }
        return reversedArray;
    }
}
