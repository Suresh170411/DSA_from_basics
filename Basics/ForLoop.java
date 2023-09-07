package DSA_from_basics.Basics;

public class ForLoop {
    
    public static void main(String[] args) {
        golguppaForFamily(10);    

        printOneToFive(5);
    }

    public static void golguppaForFamily(int golgoppa){
        for (int family=1; family<=4; family++){
            for (int i=1; i<=golgoppa; i++){
                System.out.println("Golgoppa : " + i + " to Family member : " + family);
            }
        }
        
    }

    public static void printOneToFive(int times){
        
        for (int j=1; j<=times; j++){
            for (int i=1; i<=5; i++){
                System.out.println(i);
            }
            System.out.println();
        }
    }

}
