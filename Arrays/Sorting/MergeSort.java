package Arrays.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr [] = {3,1,2,5,9,6,7};

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr [], int low, int high){
        if (low == high){
            return;
        }

        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr [], int low, int mid, int high){
        // Find sizes of two subarrays to be merged
        int n1 = mid-low+1;
        int n2 = high-mid;

        int left_arr [] = new int [n1];
        int right_arr [] = new int [n2];

        // copy elements to the temp arrays
        for (int i=0; i<n1; i++){
            left_arr[i] = arr[low+i];
        }
        for (int j=0; j<n2; j++){
            right_arr[j] = arr[mid+1+j];
        }

        int i = 0, j = 0, index = low;

        while (i<n1 && j<n2){
            if (left_arr[i] <= right_arr[j]){
                arr[index++] = left_arr[i];
                i++;
            }else {
                arr[index++] = right_arr[j];
                j++;
            }
        }

        while (i<n1){
            arr[index++] = left_arr[i];
            i++;
        }

        while (j<n2) {
            arr[index++] = right_arr[j];
            j++;
        }
    }
}
