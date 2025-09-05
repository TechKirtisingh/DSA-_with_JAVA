// transpose of array

/* 
public class transposearray {
    public static  void transposeSquare(int [][]m){
        for (int i = 0 ; i < m.length ; i++){
            for(int j = i + 1; j < m.length ; j++){ // Start from i+1 to avoid redundant swaps
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t ;
            }
        }
    }

    public static void printMatrix(int [][]m){
        for(int [] row: m){
            for (int val : row){
                System.out.print(val + " ");
            }
            System.out.println(); // Add a newline after each row for better formatting
        }
    }
    public static void main(String[] args){
        int [][] matrix = {
            { 1 , 2 , 3},
            { 4 , 5 , 6},
            { 7 , 8 , 9}
        };
        System.out.println("Orignal Matrix");
        printMatrix(matrix);
        System.out.println("Transpose Matrix");
        transposeSquare(matrix);
        printMatrix(matrix); // Print the transposed matrix
    }
}

*/ 
// transpose of non square matrix


public class transposearray{
    public static int [][] transpose(int m[][]){
        int R = m.length;
        int C = m[0].length;
        int [][] t = new int[C][R]; // Transpose C x R
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                t[j][i]=m[i][j];
            }
        }
        return t;
    }
    //method to print matrix
    public static void printMatrix(int m[][]){
        for(int row[] : m){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println(); // Add a newline after each row for better formatting
        }
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},
            {4,5,6}
        };
        System.out.println("original matrix:");
        printMatrix(matrix);

        // Transpose the matrix

        int transposed[][]=transpose(matrix);   
        System.out.println("transposed matrix:");
        printMatrix(transposed);
    }
}
