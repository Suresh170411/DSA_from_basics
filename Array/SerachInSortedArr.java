public class SerachInSortedArr {
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,0,1,2};
        int target = 0;

        int result = findTheTargetInSortedArray(arr, target);

        if (result == -1){
            System.out.println("Taget result not found !");
        }else {
            System.out.println("Target result is situated in index : " + result);
        }
    }

    public static int findTheTargetInSortedArray(int arr[], int target){
        int res = -1;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == target){
                res = i;
            }
        }
        return res;
    }
}
