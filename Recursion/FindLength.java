public class FindLength{
    public static void main(String[] args) {

        String str = "Hello";

        int length = findLengthOfString(str);
        System.out.println(length);

        bruteForceApproach(str);
    }

    public static int findLengthOfString(String str){
        if (str.equals("")) return 0;
        else return 1+findLengthOfString(str.substring(1));
    }

    public static void bruteForceApproach(String str){
        int count = 0;

        for (char c : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}