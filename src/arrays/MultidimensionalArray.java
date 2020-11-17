package arrays;

/*
* 4 * 4 , m * n, rowIndex = 0..... m - 1, colIndex = 0.....n - 1
*  i = 0...3, j = 0...3
*   0,0       0,1       0,2       0,3
*
*   1,0       1,1       1,2       1,3
*
*   2,0       2, 1      2,2       2,3
*
*   3,0       3,1       3,2       3,3
*
*   1   2   3   4
*
*   5   6   7   8
*
*   9   10  11  12
*
*   13  14  15  16
* */

public class MultidimensionalArray {
    public static void main(String[] args) {
        int row = 6, col = 6;
        int arr[][] = new int[row][col];//Declaring two dimensional array and allocating memory
        /**
         * Here two rows three column
         * ist row..2,5,4
         * 2nd row..6,9,7
         */
        // print row and col indices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(i + "," + j + "    ");
            }
            System.out.println();
        }

        // print empty array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // insert values or initialize the array
        int k = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // a[i] = k, arr[i][j] = k
                arr[i][j] = k;
                k++;
            }
        }

        // print the array after inserting values
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
