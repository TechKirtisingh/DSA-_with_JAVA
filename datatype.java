/* 
public classdatatype {
    public static void main(String[] args) {
        int age = 22; // primitive data type
        String name= "Kitadu";  //Non-primitive data type
        int[] marks ={85, 90, 78}; // Non-primitive data type (array) here int[] acts as a reference type
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("First mark: " + marks[0]); 
    }
}
*/

  //// type casting
  public class datatype {
    public static void main(String[] args) {


// implicit type casting / widening conversion : includes conversion from smaller  is assigned to larger data types
// no risk of data loss (safe)
// performed by the compiler automatically

   int a =50;
   double b=a;
   System.out.println("Implicit type casting: " + b);

// explicit type casting / narrowing conversion : excluding conversion from larger to smaller data types
// there is potential data loss
// performed by the programmer manual

    double c = 50.5;
    int d = (int) c; 
    System.out.println("Explicit type casting: " + d);

// byte to int conversion
    int num=1000;
    byte p=(byte) num; // byte range is -128 to 127, so 130 will overflow and become -126
    System.out.println(p);
    }
}



/////*  series of data types in java / data conversion heirarchy: 
//      byte , short , int ,long ,float ,double */