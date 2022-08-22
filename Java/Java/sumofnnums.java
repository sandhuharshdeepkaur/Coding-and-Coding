package Java;

import java.util.*;

// Program to write Sum of n Numbers:

public class sumofnnums {

    public static int sumofnum(){
        try (Scanner sc = new  Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();

            
            int sum = 0;                                                   // At first setting sum value to 0

            
            int i = 1;                                                   // Initialising i variable     
            while (i <= n){                                             // Setting i value upto n
                sum += i;                                              // Adding i to sum
                i++;                                                   // Updating or Incrementing the i
            }
            System.out.println("Sum of " + n + " numbers is: " + sum);
            return sum;
        }
    }
    public static void main(String args[]){
        sumofnum();
    }
    
}
