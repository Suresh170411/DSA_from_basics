public class FindLastOccurance {
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,2,2,2,2,3,5,8,9,10};
        int target = 2;

        int result = findLastOccuranceElementFromArray(arr, target);

        if (result == -1){
            System.out.println("Element not found !");
        }else {
            System.out.println("Last occurance of " + target + " is found on index : " + result);
        }
    }

    public static int findLastOccuranceElementFromArray(int arr [], int target){
        int n = arr.length;

        int low = 0, high = n-1, ans = -1;

        while (low <= high){
            int mid = low+(high-low)/2;

            if (target == arr[mid]){
                ans = mid;
                low = mid+1;
            }else if (target < arr[mid]){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
}
