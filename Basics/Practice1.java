package Basics;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int arr [] = {1,2,10,0,5,0,2,0,45};

        moveZeroesToRight(arr);
        moveZeroesToLeft(arr);
    }

    public static void moveZeroesToRight(int arr []){
        int n = arr.length;
        int index = 0;
        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while (index < n){
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToLeft(int arr []){
        int n = arr.length;
        int index = n-1;

        for (int i=n-1; i>=0; i--){
            if (arr[i] != 0){
                arr[index--] = arr[i];
            }
        }
        
        while (index >= 0){
            arr[index--] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
