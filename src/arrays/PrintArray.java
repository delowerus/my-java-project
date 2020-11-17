package arrays;

public class PrintArray {
    public static void main(String[] args) {
        //Create an array of type int
        int[] numbers = new int[5];

        //insert values
        int k = 1;
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=  k;
            k++;
        }
        //print array
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
