package arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];//Declaring multidimensional array and allocating memory
        /**
         * Here two rows three column
         * ist row..2,5,4
         * 2nd row..6,9,7
         */
        arr[0][0] = 2;
        arr[0][1] = 5;
        arr[0][2] = 4;

        arr[1][0] = 6;
        arr[1][1] = 9;
        arr[1][2] = 7;
       // System.out.println(arr[1][0]);
        //System.out.println(arr[0][2]);

        //initializing multidimensional array
        int[][]arr1= {{2,5,4},{6,9,7}};

        //using for loop to traverse through the row
        //and 2nd loop traverse through the column
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);

            }
        }





    }
}
