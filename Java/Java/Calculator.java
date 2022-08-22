package Java;

import java.util.*;

public class Calculator {

    // Program to make a calculator in simple way
    
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {            // Getting input of the numbers
            System.out.println("Enter First Number:");
            int A = sc.nextInt();

            System.out.println("Enter Second Number:");
            int B = sc.nextInt();

            System.out.println("Enter Operator");
            char Operator = sc.next().charAt(0);         // Saving input of Operators in Characters


            switch (Operator) {                                // Using Switch Statement for functionality
                case '+':
                    System.out.println(A + B);                 // Printing out the specified output
                    break;
                case '-':
                    System.out.println(A - B);
                    break;
                case '*':
                    System.out.println(A * B);
                    break;
                case '/':
                    System.out.println(A / B);
                    break;
                default:
                    System.out.println("Sorry! Operator not found!");        

            }
        }

    }

}
