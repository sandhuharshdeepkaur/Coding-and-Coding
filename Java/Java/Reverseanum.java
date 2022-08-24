package Java;

import java.util.*;

// Program to print Reverse of the given number

public class Reverseanum{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number:");      
            int n = sc.nextInt();                     // Input of the number series

            int rev = 0;                             // Starting reverse from 0

            while(n > 0){                           // While statement for input 
                int Last_d = n % 10;               // For changing last digit to first
                rev = ((rev*10) + Last_d);        // For updating the reverse condition   
                n /= 10;                         // Updating input 
            }
            System.out.println(rev);            // Printing the number series 
        }
    }
}
