import java.util.Arrays;

public class MoveZeros1{
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12};

        moveZeroesBruteForce(arr);
        moveZeroes(arr);
    }

    public static void moveZeroes(int arr []){
        int n = arr.length;
        int index = 0;
        
        for (int i : arr){
            if (i != 0){
                arr[index++] = i;
            }
        }
        while (index < n){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesBruteForce(int arr []){
        int n = arr.length;

        int newArr [] = new int [n];
        int index = 0;
        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                newArr[index++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}