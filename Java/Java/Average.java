package Java;

import java.util.*;

public class Average {

    // Program to find Average of 3 Integers
    public static void main(String args[]) {

        try (Scanner scan = new Scanner(System.in)) {     // Input for 3 numbers

            System.out.println("Enter value of A:");
            int A = scan.nextInt();

            System.out.println("Enter value of B:");
            int B = scan.nextInt();

            System.out.println("Enter value of C:");
            int C = scan.nextInt();

            
            int Average = (A + B + C) / 3;               // Calculating Average
            System.out.println(Average);
        }
    }

}
