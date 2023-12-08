public class FindCeilFloor {
    public static void main(String[] args) {
        int arr [] = {1,2,6,8,10,12,19};
        int element = 4;

        findCeilAndFloor(arr, element);
    }

    public static void findCeilAndFloor(int arr [], int element){
        int n = arr.length;

        int low = 0, high = n-1, floor = -1, ceil = -1;

        while (low <= high){
            int mid = low+(high - low)/2;

            if (element == arr[mid]){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }else if (element < arr[mid]){
                ceil = arr[mid];
                high = mid-1;
            }else {
                floor = arr[mid];
                low = mid+1;
            }
        }
        System.out.println("Floor value for the element" + element + " is : " + floor);
        System.out.println("Ceil value for the element" + element +  " is : " + ceil);
    }
}
