package Java;

import java.util.Scanner;

public class EvenOdd {

    // Program to find Even Odd numbers
    public static void main(String args[]) {
        // Input a number
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter a number:");
            int number = sc.nextInt();

            // Using Ternery Operator
            String type = ((number % 2) == 0) ? "Even" : "Odd";

            System.out.println(type);
        }
    }

}
