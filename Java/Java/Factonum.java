package Java;

import java.util.*;

public class Factonum{

    // Program to find Factorial of a given number:

    public static void main(String args[]){

        try (Scanner abc = new Scanner (System.in)) {                                      // Input for number

            System.out.println("Enter a Number to find it's Factorial:");
            int num1 = abc.nextInt();                                         
            int Fact = 1;                                                                 // Initialising Factorial Variable     

            for (int i = 1; i <= num1; i++){                                             // For loop to calculate i variable  
                
                Fact *= i;                                                              // Storing value to Fact after Fact*i

                System.out.println("Factorial of " + num1 + " number is : " + Fact);   // Printing the Factorial of a number
            } 



        } 
    }
}

