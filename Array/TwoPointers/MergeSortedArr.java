package TwoPointers;

import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int arr1 [] = {1,4,5,10};
        int arr2 [] = {2,3,6,7,8,9};

        mergetTwoSortedArray(arr1, arr2);
    }

    public static void mergetTwoSortedArray(int arr1 [], int arr2 []){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int res [] = new int [n1+n2];

        int i=0;
        int j=0;
        int k=0;

        while (i<n1 && j<n2){
            if (arr1[i] < arr2[j]){
                res[k++] = arr1[i++];
            }else {
                res[k++] = arr2[j++];
            }
        }
        
        while (i<n1){
            res[k++] = arr1[i++];
        }
        while (j<n2){
            res[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(res));
    }
}
