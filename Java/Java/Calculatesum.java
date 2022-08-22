package Java;

import java.util.*;

class Calculatesum{

// Function with Parameters and no Return Type:
    
public static void calSum(int num1, int num2){          // Function to add the input values
    int sum = num1 +num2;                              // Adding the numbers 
    System.out.println("Sum is: " + sum);              // Printing out the output

}
public static void main(String args[]){                // Main Function
    try (Scanner sc = new Scanner (System.in)) {       // Getting input from the user
        System.out.println("Enter value of a:");     
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        calSum(a,b);                                   // Calling the Calsum Function for additionn of the given inputs
    }
}
}