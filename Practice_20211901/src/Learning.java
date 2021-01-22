import java.util.Arrays;

public class Learning {
    // store a phone number and print
    // I want you guys to store 100 Phone number and probably print them
    // these phone numbers are log
    // Arrays is solution
    // what is array
    //  int, short, byte, long  = 0
    //  double/float = 0.0
    //  boolean  = false
    // Any class type = null
    // Object Ref
    public static void main(String[] args) {

        short [] nums =  { 1,4,5,2,9,7};

        int [] nums2 =  new int[]{ 1,4,5,2,9,7};
        String [] names =  { "Alhamza","Ganesh", "Amar","Harsimran" ,"Agila","Sowntharya" };

        //** write a method which should accept an array of Strings and String name
        // it should return true if name exists in array otherwise return false;
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println( Arrays.binarySearch(names, "Harsimran"));

        int [] arr2 = new int[10];
        arr2[3] = 90;
        System.out.println( Arrays.toString(arr2) );
        Arrays.fill(arr2, 10);
        System.out.println( Arrays.toString(arr2) );

        int [] arr1 = {3,1,4};
        int [] arr3 =  {1,4,3};

        System.out.println(Arrays.equals(arr1, arr3));


    }

     public static boolean checkValue(String [] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if(value.equals(arr[i])) {
                return true;
            }
        }
        return false;
     }

}

// if this is not static what should I call
