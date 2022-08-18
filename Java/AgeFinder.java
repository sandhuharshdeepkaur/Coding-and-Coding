package Java;

import java.util.Scanner;

public class AgeFinder {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Age:");
            int Age = sc.nextInt();

            if (Age >= 18 && Age < 19) {
                System.out.println("An Adult");
            } else if (Age > 13 && Age < 18) {
                System.out.println("A Teenager");
            } else if (Age < 13) {
                System.out.println("A Child");
            } else {
                System.out.println("Neither Adult Nor Teenager.");
            }
        }

    }

}
