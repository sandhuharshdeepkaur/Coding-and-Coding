import java.util.*;


public class printmtonnum{
    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First number of the series:");
            int m = sc.nextInt();

            System.out.println("Enter the nth number of the series:");
            int n = sc.nextInt();
        
        for (int i = m; i <= n; i++){
            System.out.print(" "+ i);
        }
    }
    }
}