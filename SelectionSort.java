/*
 * Class SelectionSort is the implementation of the Selection Sort algorithm. It sorts the array
 * of integers in ascending order.
 *
 * @version 1.0 12 Apr 2023
 * @author Ashwini Suresh
 * */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 100, -10};
        int n = arr.length;
        int temp = 0;
        int leastIndex = 0;

        //sort the array
        for (int i = 0; i < n - 1; i++) {
            leastIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[leastIndex]) {
                    leastIndex = j;
                }
            }
            if (leastIndex != i) {
                temp = arr[leastIndex];
                arr[leastIndex] = arr[i];
                arr[i] = temp;
            }
        }

        //print the sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
