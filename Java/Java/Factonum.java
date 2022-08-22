package Java;


public class Factonum{

    // Program to find Factorial of a given number:

    public static int factorial(int n){
        int Fact = 1;                                                                 // Initialising Factorial Variable     

        for (int i = 1; i <= n; i++){                                                 // For loop to calculate i variable  
            
            Fact *= i;                                                                // Storing value to Fact after Fact*i
        }    
        return Fact;                                                                 // Returning the factorial value
    }

    public static void main(String arg[]){ 

                System.out.println(factorial(4));                                   // Printing the Factorial of a number
            } 

    }