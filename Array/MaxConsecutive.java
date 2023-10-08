public class MaxConsecutive {
    public static void main(String[] args) {
        int arr [] = {1,1,0,1,1,1,1,1,0,0,1,1,1,1};

        maxConsicutiveOnes(arr);
    }

    public static void maxConsicutiveOnes(int arr []){
        int n = arr.length;

        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] == 1){
                count++;
            }else {
                count = 0;
            }
            if (count > max){
                max = count;
            }
        }
        System.out.println(max);
    }
}
