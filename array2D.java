// 2d array: ia an array of arrays . this allows rectangular or jagged (differtent column per rows)shape
//ractangular 2d (same column each row)

/*
public class array2D {
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

public class array2D
{
    public static void main(String[] args) {
        int grid[][]={{1,2,3}
                    ,{4,5,6},
                     {7,8,9}};
        System.out.println("print the 2d array : ");
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}



