package Java;

import java.util.*;

public class Average {

    // Program to find Average of 3 Integers
    public static void main(String args[]) {

        // Input for 3 numbers
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter value of A:");
            int A = scan.nextInt();

            System.out.println("Enter value of B:");
            int B = scan.nextInt();

            System.out.println("Enter value of C:");
            int C = scan.nextInt();

            // Calculating Average
            int Average = (A + B + C) / 3;
            System.out.println(Average);
        }
    }

}
