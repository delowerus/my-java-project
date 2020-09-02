package arrays;

public class PrintArray {
    public static void main(String[] args) {
        //Create an array of type int
        int[] numbers = new int[5];
        //insert values
        for( int i = 0; i < numbers.length; i++){
            numbers[i]= i + 1;
        }
        //print array
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
