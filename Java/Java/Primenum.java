package Java;

import java.util.*;

// Program to find given number is Prime Number or not

public class Primenum{

    public static void main(String args[]){

    try(Scanner sc = new Scanner(System.in)){           
        System.out.println("Enter a number:");                               // Input for the number
        int n = sc.nextInt();                                                  // Initializing input as integer

            boolean isPrime = true;                                          // Boolean variable set on true

            if(n == 0 || n == 1){
                System.out.println(n+ " Nor Prime Neither Composite.");
            }else{
            for (int i = 2; i <= Math.sqrt(n); i++){                       // For loop to initialize the i value
                if (n % i == 0){                                          // If conditionn to check the prime number    
                    isPrime = false;                                     // Boolean value if the condition is true
                }
            }
            if (isPrime == true){
                System.out.println(n + " is a Prime Number.");        // Printing the Prime numbers 
            }else{
                System.out.println(n + " is Not a Prime Number.");   // Printing the Non Prime Numbers
            }
        }
    }
} 
}





