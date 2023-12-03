package Array;

public class MaxMin {
    public static void main(String[] args) {
        int arr [] = {12,4,3,7,9,1,90};

        findMin(arr);
        findMax(arr);
    }

    public static void findMin(int arr []){
        int n = arr.length;

        int min = Integer.MAX_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value from the array is : " + min);
    }

    public static void findMax(int arr []){
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value from the array is : " + max);
    }
}
