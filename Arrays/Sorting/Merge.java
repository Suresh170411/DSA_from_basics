package Arrays.Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr [] = {3,2,5,1,5,0,8};
        int n = arr.length;

        System.out.println("Before : " + Arrays.toString(arr));
        mergeSort(arr, 0, n-1);
        System.out.println("After : " + Arrays.toString(arr));
    }

    public static void mergeSort(int arr [], int left, int right){
        if (left >= right) return;

        int mid = left + (right-left)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        mergeArr(arr, left, mid, right);
    }

    public static void mergeArr(int arr [], int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i=0; i<n1; i++){
            L[i] = arr[left+i];
        }
        for (int i=0; i<n2; i++){
            R[i] = arr[mid+1+i];
        }

        // merge two arrays
        int i=0, j=0, k=left;

        while (i<n1 && j<n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy elements
        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
