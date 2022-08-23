package Java;

// Program to print different Patterns

public class Pattern {

    public static void pattern1(){
        for (int i = 1; i <= 4; i++){
            for (int s = 1; s <= i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(){
        for (int i = 1; i <= 5; i++){
            for (int n = 1; n <= i; n++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        pattern1();
        pattern2();
    }
}  

