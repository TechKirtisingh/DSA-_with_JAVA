import java.util.Scanner;

 public class reverse1 {
    static void reverse(int arr[])
    {
        System.out.println("reverse array is : ");
        for(int i=arr.length-1; i<arr.length;i--)
        {
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter size of array : ");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the element of array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt(); 
        }
        reverse(a);
        sc.close();
    }
}


