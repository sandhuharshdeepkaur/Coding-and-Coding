import java.util.*;


public class printmtonnum{

    // Program to print numbers from m to n
    public static void main(String args[]){

        
        try (Scanner sc = new Scanner(System.in)) {                     // Input of m number:
            System.out.println("Enter First number of the series:");
            int m = sc.nextInt();

            
            System.out.println("Enter the nth number of the series:");  // Input for n number:
            int n = sc.nextInt();

            
        for (int counter = m; counter <= n; counter++){                  // For loop for output
            System.out.print(" "+ counter);                             // Printing the numbers
        }
    }
    }
}