package Array;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};

        reverseArray(arr);
    }

    public static void reverseArray(int arr []){
        int n = arr.length;

        int reversedArray [] = new int [n];
        int index = 0;
        for (int i=n-1; i>=0; i--){
            reversedArray[index] = arr[i];
            index++; 
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
