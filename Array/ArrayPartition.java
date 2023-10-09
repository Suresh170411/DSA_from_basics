import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int arr [] = {6,2,6,5,1,2};

        arrayPartition(arr);
    }

    public static void arrayPartition(int arr []){
        
        Arrays.sort(arr);

        int sum = 0;

        for (int i=0; i<arr.length; i= i+2){
            sum+= arr[i];
        }

        System.out.println(sum);
    }
}
