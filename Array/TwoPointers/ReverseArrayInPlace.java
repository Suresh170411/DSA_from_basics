package TwoPointers;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        reverseArrayInPlace(arr);
    }

    public static void reverseArrayInPlace(int arr []){
        int n = arr.length;

        int l = 0;
        int r = n-1;

        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
