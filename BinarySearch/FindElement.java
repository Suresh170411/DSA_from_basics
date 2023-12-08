public class FindElement {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};

        int target = 5;

        int result = findElementFromArray(arr, target);
        
        if (result == -1){
            System.out.println("Please provide a valid number !");
        }else {
            System.out.println("Element found on the index : " + result);
        }
    }

    public static int findElementFromArray(int arr [], int target){
        int n = arr.length;

        int low = 0, high = n-1;

        while (low <= high){
            int mid = low+(high - low)/2;

            if (target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}
