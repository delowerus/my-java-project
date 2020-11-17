package arrays;

public class ArrayMaxMin {

    static int minimum(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maximum(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int a[] = {3, 4, 6, 1, 2};
        System.out.println(minimum(a) + 10);
        System.out.println(maximum(a)  +  minimum(a));
    }
}
