package arrays;

/*
* int[] arr = {4, 7, 9, 0, 1}, min= 2147483647
*  arr = [7, 10, 4, 1, 0], i = 0....n - 1 = 0.... 5 - 1 = 0.....4
* max = arr[0] = 7
*
*
* */

public class MaximumMinimum {

    static int minimum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i]; // new min value
            }
        }
        return min;
    }

    static int maximum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; // new max value
            }
        }
        return max;
    }

    public static void main(String[] args) {
       int[] arr = {3, 4, 6, 1, 2};
        System.out.println(minimum(arr));
        System.out.println(maximum(arr));
    }
}
