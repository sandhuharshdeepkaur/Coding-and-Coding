package Java;

import java.util.Scanner;

public class EvenOdd {

    // Program to find Even Odd numbers
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in);) {                   // Input a number
            System.out.println("Enter a number:");
            int number = sc.nextInt();

            
            String type = ((number % 2) == 0) ? "Even" : "Odd";        // Using Ternery Operator

            System.out.println(type);
        }
    }

}
