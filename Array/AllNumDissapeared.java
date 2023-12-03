import java.util.Arrays;

public class AllNumDissapeared {
    public static void main(String[] args) {
        int arr [] = {4,3,2,7,8,2,3,1};

        allNumberDissapearedFromArray(arr);
    }

    public static void allNumberDissapearedFromArray(int arr []){
        int n = arr.length;

        int res [] = new int [n];

        for (int i=0; i<n; i++){
            res[arr[i]-1]++;
        }

        System.out.print("Missing Numbers from the array " + Arrays.toString(arr) + " are : ");
        for (int i=0; i<n; i++){
            if (res[i] == 0){
                System.out.print(i+1 + " ");
            }
        }
        System.out.println();
    }
}
