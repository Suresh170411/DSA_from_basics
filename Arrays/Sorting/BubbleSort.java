package DSA_from_basics.Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {1,9,3,8,2,5};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int [] bubbleSort(int arr []){
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
