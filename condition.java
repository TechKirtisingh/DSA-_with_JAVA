import java.util.*;
public class condition {

    public static void main(String[] args) {
        // int age =16;
        // if(age>=18){
        //     System.out.println("You are eligible to vote.");    
        // } else {
        //     System.out.println("You are not eligible to vote.");
        //}


        /// nesterd if else statement
     
        
    //     int marks=15;
    //     if(marks>=90){
    //         System.out.println("Grade A+");
    //     }
    //     else if(marks>=75){
    //         System.out.println("Grade A");
    //     }
    //     else if(marks>=60){
    //         System.out.println("Grade B");  
    //    }
    //     else{
    //         System.out.println("Grade C");
    //     }


        // switch statement : used when you have multiple conditions to check based on a single variable.
        // enum: is a special data type that enables a variable to be a set of predefined constants.


/*    
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter any day number : ");
        int dayNumber = sc.nextInt();
        

        switch(dayNumber) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");    
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
            System.out.println("It's Sunday");
            default:
                System.out.println("Invalid day entered. Please enter a valid day of the week.");
                break;
        }

        */



     // while loop: used in conditional

        int i = 1;
        while (i<=5){
            System.out.println(i);
            i++;
        }   

    // for loop: used for iteration

      int j;
      for(j=1;j<=5;j++){
        System.out.println(j);
      }

    // do while loop: used to execute a block of code at least once and then repeat it as long as a specified condition is true. 

    int k = 1;
    do{
        System.out.println(k);
    }
    while(k<=5);    
 }
}
