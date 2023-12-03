package DSA_from_basics.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {6,2,7,1,8};
        int res [] = selectionSort(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int [] selectionSort(int arr []){
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            int min = i;
            for (int j=i+1; j<n; j++){
                if (arr[min] > arr[j]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
