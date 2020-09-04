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
        int a[] = {33, 3, 4, 5, 2, 1};
        System.out.println("inside main method: " + minimum(a));
        System.out.println("max: " + maximum(a));
    }
}
