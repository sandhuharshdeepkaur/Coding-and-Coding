package Java;

import java.util.*;

public class IncomeTaxCal {
    public static void main(String args[]) {
        int tax;
        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Enter your Salary:");
            int salary = var.nextInt();

            if (salary < 500000) {
                tax = 0;
            } else if (salary >= 500000 && salary < 1000000) {
                tax = (int) (salary * 0.2);
            } else {
                tax = (int) (salary * 0.3);
            }
            System.out.println("Your Income Tax is:" + tax);

        }

    }

}
