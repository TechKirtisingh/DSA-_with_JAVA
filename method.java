import java.util.Scanner;
import java.util.*;

public class method {
    // non parameterized or no return value method...

  /*   static void greet(){
         System.out.println("welcome to my world");
     }
     public static void main(String[] args) {
         greet();
         greet();
     } */

   // non parameterized with return value method
  /* static String getmessage(){
    return "JAVA IS AWESOME";
   }
   public static void main(String[] args) {
     String msg = getmessage();  //object
     System.out.println(msg);
   } */

   // parametarize with no return type

  /*  static void greet(String name){
    System.out.println("hello,"+name +"!");
   }
   public static void main(String[] args) {
    greet("maddy");
    greet("kittu");
   }
    */

  /*   static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] arg){
        int result= add(5,6);
        System.out.println("Sum: "+result);
      System.out.println(add(7, 6));
    }
 */

 ///////////////////  QUESTION :::::::::::
 // Write a method called 'printtable' that takes an integer as input and prints its multiplication table up to 10

/*   static void printTable(int j){
        for(int i=0;i<=10;i++){
            System.out.println(i+"*"+j+"="+(i*j));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("enter number : ");

        int j=sc.nextInt();
        printTable(j);
    }
*/  
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return(a+b);

    }
    public static void main(String[] args) {
        int  add1 = add(7,8);
        double add2 = add(56,23);
        System.out.println("INTEGER : ",+add1);
        System.out.println("Double: ",+add2);
    }


}
