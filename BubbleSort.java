/*
 * Class BubbleSort is the implementation of the BubbleSort algorithm. It sorts the array
 * of integers in ascending order.
 *
 * @version 1.0 12 Apr 2023
 * @author Ashwini Suresh
 * */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 5, 6, 1, 0, -5, -100};
        int arrlen = arr.length;
        int temp;

        //Sorting the array in ascending order
        for (int i = 0; i < arrlen -1 ; i++) {
            for (int j = 0; j < arrlen - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //print the sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
