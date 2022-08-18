package Java;

import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number:");
            int A = sc.nextInt();

            System.out.println("Enter Second Number:");
            int B = sc.nextInt();

            System.out.println("Enter Operator");
            char Operator = sc.next().charAt(0);

            switch (Operator) {
                case '+':
                    System.out.println(A + B);
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
