// public class arrays {
// public static void main(String[] args) {
       /*
        int a[]; //declaration
        a=new int[5]; //instantiation
        int b[]=new int[5]; //declaration + instantiation
        String s[]  =new String[5]; //array of objects
        int c[]={1,2,3,4,5}; //declaration + instantiation + initialization
        System.out.println(c[0]);
        System.out.println(c.length); //length gives size of array
        System.out.println(b[3]);
        System.out.println(a[5]);
        System.out.println(s[3]);
       */

      // length and iteration 

    /*  int b[]={1,2,3,4,5};
     int n=b.length;  // property not a method
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i] + " ");
        }
        for(int val : b) // enhanced for
            {
                System.out.println(val + " ");
            }
      */
//       }
// }



// jaggered 2d: (differtent column per rows) 
//int jag[][]=new int [3][];
//jag[0] = new int[] {1,3};     
// jag[1] = new int[] {1,2,3};
// jag[2] = new int[] {6);



// public class arrays{
//     static int find(int arr[],int key)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==key)
//                 System.out.println(i+ " ");
//                 else
//                     System.out.println(" -1");
//         }
//         System.out.println(" -1");
//         return 0;
//     }
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         int key=5;
//         int val = find(a,key);
//         System.out.println(val);
        
//     }

// }


//ractangular 2d (same column each row)
/* 
public class arrays
{
    public static void main(String[] args)
     {
        
    int mat[][] = new int[3][4];
    int grid[][] = {[1,2,3],[4,5,6]};

    // jaggerd form:
    int jag[][]=new int [3][];
    jag[0] = new int[] {1,3};

    }
}
*/


/* 
public class arrays
{
    public static void main(String[] args) 
    {
        int jag[][] = new int[3][];
        jag[0] = new int[] {1,2};
        jag[1] = new int[] {3,4,5};
        jag[2] = new int[] {6};

    // print the jagged array using nested loops
    System.out.println("jagged array contents:");
    for(int i=0;i<jag.length;i++)
    {
        for(int j=0;j<jag[i].length;j++)
        {
            System.out.print(jag[i][j]+ " ");
        }

    System.out.println();    
    }    

    }
}
*/


// jagged array::==>


/* 
public class arrays{
    public static void main(String[] args) {
        // creating a jagged array with 3 row
        int jag[][] = new int[3][];
        jag[0]=new int []{1,2};
        jag[1]=new int []{3,4,5};
        jag[2]=new int []{6};

        System.out.println("jagged array elements: ");
        for(int i=0 ; i<jag.length;i++)
        {
            for(int j=0; j<jag[i].length;j++) 
            {
                System.out.print(jag[i][j]+ " ");
            }
            System.out.println(); // move to next row
        }

    }
}
*/












