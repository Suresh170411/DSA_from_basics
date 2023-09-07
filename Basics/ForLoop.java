package DSA_from_basics.Basics;

public class ForLoop {
    
    public static void main(String[] args) {
        // golguppaForFamily(10);    

        // printOneToFive(5);

        fatherSonDuo();
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

    public static void fatherSonDuo(){
        
        // father said son to plant 10 seeds each on 5 of the farms

        for (int j=1; j<=5; j++){
            for (int i=1; i<=10; i++){
                System.out.println(i); //plant 10 seeds
            }
            System.out.println();
        }
    }

}
