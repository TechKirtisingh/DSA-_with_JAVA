    //// sorting and serching...
    

 /*    
import java.util.Arrays;
public class searchandsort { 
public class array{
    public static void main(String[] args) {
        int arr[]={5,2,9,1,5}; // original array/unsoreted array
        Arrays.sort(arr); // sorted array
        System.out.println("sorted array is :" +Arrays.toString(arr)); //print the sorted array
        //serching for a element by using binary search
        int index=Arrays.binarySearch(arr, 5);
        System.out.println("index of 5 is : " +index);
        }
    }
}

*/

/// length of the array and copy of array

public class searandsort{
    public static void main(String[] args) 
    {
        int src[]={1,2,3,4,5};
        int first3[]= java.util.Arrays.copyOf(src,3);
        int mid[]= java.util.Arrays.copyOfRange(src, 1, 4);
        System.out.println("original src array: "+java.util.Arrays.toString(src));
        System.out.println("First 3 element: "+java.util.Arrays.toString(first3));
        System.out.println("Middle element (1 to 3): "+java.util.Arrays.toString(mid));

    }
}

