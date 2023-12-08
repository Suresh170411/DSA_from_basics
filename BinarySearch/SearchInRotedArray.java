public class SearchInRotedArray{
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,8,9,10,1,2};
        int target = 1;

        int res = findElementFromRotedSortedArr(arr, target);
        System.out.println(res);

    }

    public static int findElementFromRotedSortedArr(int arr [], int target){
        int n = arr.length;

        int low = 0, high = n-1;

        while (low <= high) {
            int mid = low+(high-low)/2;

            if (target == arr[mid]){
                return mid;
            }else if (arr[low] <= arr[mid]){
                //low-mid is sorted
                if (target >= arr[low] && target < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if (arr[mid] <= arr[high]){
                //mid-high is high
                if (target <= arr[high] && target > arr[mid]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}