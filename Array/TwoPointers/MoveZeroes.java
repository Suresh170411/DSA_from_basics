package TwoPointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr [] = {0,1,1,0,0,0,1,0,1,1};

        // moveZeroes(arr);
        moveZeroApproach(arr);
    }

    public static void moveZeroes(int arr []){
        int n = arr.length;

        int l = 0;
        int r = n-1;

        while (l<r){
            while(arr[l] == 0){
                l++;
            }
            while (arr[r] == 1){
                r--;
            }

            if (l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroApproach(int arr []){
        int n = arr.length;

        int index = n-1;
        for (int i=n-1; i>=0; i--){
            if (arr[i] != 0){
                arr[index--] = arr[i];
            }
        }

        while (index > 0){
            arr[index--] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
