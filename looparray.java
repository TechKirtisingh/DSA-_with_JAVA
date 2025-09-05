//1.WAP to print the multiplication table of a number
import java.util.Scanner;
/* 
public class looparray {
    public static void main(String[] args) {
        int num = 5;
        for(int i=1 ; i<11 ; i++)
        {
            System.out.println(num +"*"+ i +"=" +(num*i));
        }
    }

    
}
*/

// write a program to reverse a number (eg. 123 -> 321)

/* 
public class looparray 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("reversed number is: " + rev);
    }

}
*/


public class looparray 
{
    static int palindrome (int n){
        int rev = 0;
        while(n!=0)
        {
            int temp = Math.abs(n);
            rev = rev * 10 + (temp%2);
            temp = temp / 10;
        }
        return (rev = Math.abs(n));
    }
    public static void main(String[] args) 
    {
        System.out.println("enter the value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(palindrome(n)==1)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}








