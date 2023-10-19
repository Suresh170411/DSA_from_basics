import java.util.Arrays;

public class MoveZeroes2 {
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12,0};
        func(arr);
    }

    public static void func(int arr []){
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
