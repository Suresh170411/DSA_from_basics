package DSA_from_basics.Basics;

public class PatterPrinting {
    public static void main(String[] args) {
        // printTriangle1(2);

        // System.out.println("\n");

        // triangle2(5);
        // printInNums();
        printPatternWithNum();
    }

    public static void printTriangle1(int n){
        
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void triangle2(int n){

        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printInNums(){
        
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternWithNum(){
        
        for (int i=1; i<=5; i++){
            String num = "";
            String star = "";
            
            for (int j=1; j<=i; j++){
                num+= j+" ";
                star+= "* ";
            }
            System.out.println(num);
            System.out.println(star);
        }
    }
}