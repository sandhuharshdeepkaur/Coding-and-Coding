package Java;

import java.util.Scanner;

//Program to Swap the numbers

public class swap {
    
    public static void swapnum (int num1 , int num2){         // Swap function

        int temp = num1;                                      // Temporary variable to store the value a
        num1 = num2;                                         // Storing the value b to a
        num2 = temp;                                        // Storing temporary value to b

        System.out.println("After Swap a = " + num1);      // Printing out the variables
        System.out.println("After Swap b = " + num2);
    }
    public static void main(String arg[]){                 // Main Function
        try (Scanner abc = new Scanner(System.in)) {      // Input Function      

            System.out.println("Enter valule of a:");    
            int a = abc.nextInt();

            System.out.println("Enter value of b:");
            int b = abc.nextInt();

            swapnum(a,b);                                  // Calling the Swap Function
        }

    }
}
