package Java;

import java.util.*;

public class Average {

    // Program to find Average of 3 Integers
    public static void main(String args[]) {

        // Input for 3 numbers
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        // Calculating Average
        int Average = (A + B + C) / 3;
        System.out.println(Average);
    }

}
