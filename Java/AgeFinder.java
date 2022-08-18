package Java;

import java.util.*;

public class AgeFinder {

    //Program to find Age range of the user
    public static void main(String args[]) {
        
        // Getting input of Age from viewer
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Age:");
            int Age = sc.nextInt();

            // Checking conditions 
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
