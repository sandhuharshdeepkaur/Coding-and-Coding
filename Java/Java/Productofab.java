package Java;

// Program to print Product of numbers

public class Productofab{

    public static int multiply( int num1, int num2){   // Multiply Function
        int product = num1 * num2;                    // Multiplyig two integers
        return product;                              // Returning the integer values
    } 

    public static void main(String arg[]){          // Min function
        
        int prod = multiply(9,1);       // Storing product of integers in a variable

        System.out.println("a * b = " + prod);    // Printing the output
    }
}