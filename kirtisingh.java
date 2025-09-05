// question 1.
// Sort in Descending Order , Given an array int[] arr = {3, 7, 2, 9, 4}, sort the array in descending order and print it.

/*
import java.util.Arrays;
public class kirtisingh {
    public static void main(String[] args) {
    int arr[]={3,7,2,9,4};
    Arrays.sort(arr);
    reverse(arr);
    System.out.println("sorted array is :" +Arrays.toString(arr));
    }
    static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

    }
}
*/

// question 2.
// Find the First and Last Occurrence of a Number Given int[] arr = {4, 2, 7, 4, 9, 4}, find the first and last index of the number 4.

/* 
public class kirtisingh {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 4, 9, 4};
        int key = 4;
        find(arr, key);
    }
    static int find(int arr[],int key){
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                if(firstIndex == -1) {
                    firstIndex = i; 
                }
                lastIndex = i; 
            }
        }
        System.out.println("First Index: " + firstIndex);
        System.out.println("Last Index: " + lastIndex);
        return 0;
    }
}
*/


// question 3.
// Count the Frequency of Each Element Given int[] arr = {1, 2, 2, 3, 3, 3}, count and print how many times each number occurs.

/* 
public class kirtisingh
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3};
        countFrequency(arr);
    }
    static void countFrequency(int arr[]) {
        int n = arr.length;
        boolean visited[] = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i]) 
            continue; 
            int count = 1; 
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                    visited[j] = true; 
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times.");
        }
    }
}

*/

// question 4.
// Reverse the Array Given int[] arr = {10, 20, 30, 40, 50}, reverse the array in-place .

/* 
import java.util.Arrays;
public class kirtisingh 
{
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 40, 50};
        reverse(arr);
        System.out.println("Reversed array is: " + Arrays.toString(arr));
    }
    static void reverse(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) 
        {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

    }
}
*/

//question 5.
//Check if the Array is Sorted ,Write a method that returns true if an array is sorted in ascending order, otherwise false

/*                      
public class kirtisingh {
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 40, 50};
        boolean isSorted = checkSorted(arr);
        System.out.println(isSorted);
    }
    static boolean checkSorted(int arr[])
     {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] > arr[i + 1])
            {
                return false; 
            }
        }
        return true; 
     }
}
*/

// question 6.
//Copy Only Even Numbers Given int[] arr = {1, 4, 6, 7, 8}, copy only the even numbers into a new array and print it.

/*
import java.util.Arrays;
public class kirtisingh
 {
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 6, 7, 8};
        int evenCount = 0;
        for (int num : arr) 
        {
            if (num % 2 == 0)
            {
                evenCount++;
            }
        }
        int evenArr[] = new int[evenCount];
        int index = 0;
        for (int num : arr)
        {
            if (num % 2 == 0) 
            {
                evenArr[index++] = num;
            }
        }
        System.out.println("Even numbers are: " + Arrays.toString(evenArr));
    }
}
*/

// question 7.
//Write a program to find the second largest number in an array like int[] arr = {10, 20, 4, 45, 99}.
/* 
public class kirtisingh {
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 4, 45, 99};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) 
        {
            if (num > largest) 
            {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) 
            {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) 
        {
            System.out.println("There is no second largest element.");
        } else 
        {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
*/

// question 8.
//Find Duplicate Elements ,Given int[] arr = {1, 3, 2, 3, 4, 1}, print all duplicate elements only once.
/* 
public class kirtisingh {
    public static void main(String[] args) 
    {
        int arr[] = {1, 3, 2, 3, 4, 1};
        findDuplicates(arr);
    }
    static void findDuplicates(int arr[]) 
    {
        int n = arr.length;
        boolean visited[] = new boolean[n];
        System.out.print("Duplicate elements are: ");
        for (int i = 0; i < n; i++) 
        {
            if (visited[i]) 
            continue; 
            int count = 1; 
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                    visited[j] = true; 
                }
            }
            if (count > 1) 
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
*/

// question 9.
//. Merge Two Sorted Arrays  int[] a = {1, 3, 5} and int[] b = {2, 4, 6} into a single sorted array.
/* 
public class kirtisingh 
{
    public static void main(String[] args) 
    {
        int a[] = {1, 3, 5};
        int b[] = {2, 4, 6};
        int merged[] = mergeSortedArrays(a, b);
        System.out.println("Merged sorted array: ");
        for (int num : merged) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static int[] mergeSortedArrays(int a[], int b[]) 
    {
        int n = a.length;
        int m = b.length;
        int merged[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) 
        {
            if (a[i] <= b[j]) 
            {
                merged[k++] = a[i++];
            } else 
            {
                merged[k++] = b[j++];
            }
        }
        while (i < n) 
        {
            merged[k++] = a[i++];
        }
        while (j < m) 
        {
            merged[k++] = b[j++];
        }
        return merged;
    }
}
*/

// question 10.
//Binary Search Without Using Built-in Method Implement your own version of binary search to find a number in a sorted array.
/* 
public class kirtisingh {
    public static void main(String[] args)
     {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int result = binarySearch(arr, key);
        if (result == -1)
        {
            System.out.println("Element not found in the array.");
        } else 
        {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch(int arr[], int key) 
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; 
            }
            if (arr[mid] < key) 
            {
                left = mid + 1; 
            } else 
            {
                right = mid - 1; 
            }
        }
        return -1; 
    }
}

*/


