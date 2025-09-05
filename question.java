// Declare an integer variable num with a value 100
// Convert it into a double using widening casting
//  Convert the same integer into a byte using narrowing casting.
// Print all three values

import java.util.Scanner;

public class question {
    public static void main(String[] args) {


        // int num=200;
        // double num1=(double) num;
        // byte num2=(byte) num;
        
        // System.out.println("Integer : " + num);
        // System.out.println(" double: " + num1);
        // System.out.println(" byte: " + num2);


/*      


/// calculate the average of the three number::
/// determine if the average is greater than  each of the numbers using relational and logical operators
/// use operators to update each number : multiple a by 2, add 5 to b, and subtract 3 from c
/// use increment and decrement operators on each update value : inc a , dec b, and inc c.
    int a ,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    System.out.println("original values: " + a + " " + b + " " + c);
    double average =(a+b+c)/3.0;
    System.out.println("Average: " + average);

    boolean isGreaterThanA = average > a;
    boolean isGreaterThanB = average > b;
    boolean isGreaterThanC = average > c;   
    System.out.println("Is average greater than a? " + isGreaterThanA);
    System.out.println("Is average greater than b? " + isGreaterThanB);
    System.out.println("Is average greater than c? " + isGreaterThanC);


   a *= 2;
   b += 5;
   c -= 3;
   System.out.println("final outcome: " + a + " " + b + " " + c);

   a++;
   b--;
   c++;
   System.out.println("After incrementing and decrementing: " + a + " " + b + " " + c);


*/


// Reads an integer 'n' from the users;
// Uses if else  to check if it is positive , negative, or zero;
// Uses a for loop to print all numbers from 1 to n;
// uses a switch statement to print the 'n'th day of the week (1=MONDAY ,2=TUESDAY....)
    // Scanner sc= new Scanner(System.in); 
    //  System.out.println("Enter the number : ");
    //  int num = sc.nextInt();
    //   // Check if the number is positive, negative, or zero
    //   if(num>0) {
    //     System.out.println("positive number:");
    //   }
    //   else if(num<0) {
    //     System.out.println("negative number:");
    //   }
    //   else {
    //   System.out.println("zero");
    //   }

    //     // Print numbers from 1 to n
    // int i;
    // System.out.println("number from 1 to num : " +num);    
    // for(i=1 ; i<=num; i++){
    //     System.out.println(" "+i);
    // }

    // // switch case:;

    // System.out.println("Enter the day number (1-7): ");
    // int day = sc.nextInt();
    // switch (day) {
    //     case 1:
    //     System.out.println("Monday");
    //         break;
    //     case 2:
    //     System.out.println("Tuesday");
    //         break;
    //     case 3:
    //     System.out.println("Wednesday");
    //         break;
    //     case 4:
    //     System.out.println("Thursday");
    //         break;
    //     case 5:
    //     System.out.println("Friday");    
    //       break;
    //     case 6:
    //     System.out.println("Saturday");
    //        break;
    //     case 7:
    //     System.out.println("sunday");   
    //     default:
    //     System.out.println("Invalid");
    //         break;
    // }


/* 
    System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }

            int sum = 0;
            int temp = num; 
            while (temp > 0) {
                if (temp % 2 == 0) {
                    sum += temp;
                }
                temp--; 
            }
            System.out.println("Sum of even numbers: " + sum);

            int i = 1;
            do {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            } while (i <= 10);
            System.out.println("use 1 for prime,2 for odd/even and 3 exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    int c=0;
                    for(int k=1;k<=num;k++){
                        if(num%k==0){
                            c++;
                        }
                    
                
                    }
                    if(c==2){
                        System.out.println("prime");
                        break;
                    }
                    else{
                        System.out.println("Not prime");
                    }
                    break;
                case 2:
                    if(num%2==0){
                        System.out.println("even");
                    }
                    else{
                        System.out.println("odd");
                    }
            
                default:
                    break;
            }
        } */


    }
    
}
