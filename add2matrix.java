public class add2matrix {
    // method to add two matrices
    public static int [][] add(int A[][],int B[][]){
        int R = A.length; // number of rows
        int C = A[0].length; // number of columns
        int sum[][] = new int[R][C]; // result matrix
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        return sum;
    }
    public static void printMatrix(int m[][])
    {
        for(int row[] : m)  //// yaha pr m ek 2d array hai jisme har element ek 1d array hai
        { 
            for(int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println(); // Add a newline after each row for better formatting
        }
    }
    public static void main(String[] args) 
    {
        int A[][]={
            {1,2,3},
            {4,5,6}
        };

        int B[][]={
            {7,8,9},
            {10,11,12}
        };

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);
        
        int sum[][]= add(A,B);
        System.out.println("Sum of A and B:");
        printMatrix(sum);
    }
}
