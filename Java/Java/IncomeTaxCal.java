package Java;

import java.util.*;

public class IncomeTaxCal {

    // Program to print Income Tax deducted on the salary 
    
    public static void main(String args[]) {
        int tax;                                                     // Initializing variable
        try (Scanner var = new Scanner(System.in)) {                // Input for salary
            System.out.println("Enter your Salary:");
            int salary = var.nextInt();

            if (salary < 500000) {                                 // Using Else if statement to check salary boudaries
                tax = 0;
            } else if (salary >= 500000 && salary < 1000000) {
                tax = (int) (salary * 0.2);
            } else {
                tax = (int) (salary * 0.3);
            }
            System.out.println("Your Income Tax is:" + tax);      // Printing the Calculated Tax

        }

    }

}
