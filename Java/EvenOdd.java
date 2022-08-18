package Java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter a number:");
            int number = sc.nextInt();

            String type = ((number % 2) == 0) ? "Even" : "Odd";

            System.out.println(type);
        }
    }

}
