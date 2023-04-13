/*
 * Class MergeSort is the implementation of the MergeSort algorithm. It sorts the array
 * of integers in ascending order.
 *
 * @version 1.0 12 Apr 2023
 * @author Ashwini Suresh
 * */

public class MergeSort {
    private static void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[arr.length - mid];

        //divide the array into two parts
        for (int i = 0; i < mid; i++) {
            leftarr[i] = arr[i];
        }
        int j = 0;
        for (int i = mid; i < arr.length; i++) {
            rightarr[j++] = arr[i];
        }

        //sort left and right array and then merge
        sort(leftarr);
        sort(rightarr);
        merge(arr, leftarr, rightarr);
    }

    private static void merge(int[] arr, int[] leftarr, int[] rightarr) {
        int i = 0;
        int j = 0;
        int k = 0;
        do {
            if (i == leftarr.length) {
                arr[k++] = rightarr[j++];
                continue;
            }
            if (j == rightarr.length) {
                arr[k++] = leftarr[i++];
                continue;
            }
            if (leftarr[i] > rightarr[j]) {
                arr[k++] = rightarr[j++];
            } else if (leftarr[i] == rightarr[j]) {
                arr[k++] = leftarr[i++];
                arr[k++] = rightarr[j++];
            } else {
                arr[k++] = leftarr[i++];
            }
        } while ((i < leftarr.length) || (j < rightarr.length));

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -5, -100, 56, -56, 1, 2, 3, 67, -100};

        sort(arr);

        //print the sorted array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
