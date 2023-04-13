/*
 * Class InsertionSort is the implementation of the Insertion Sort algorithm. It sorts the array
 * of integers in ascending order.
 *
 * @version 1.0 12 Apr 2023
 * @author Ashwini Suresh
 * */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 0, -5, -100, 56, -56, 1, 2, 3, 67, -100};
        int n = arr.length;
        int temp;

        //sort the array
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //print the sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
