package Java;

import java.util.*;

public class AgeFinder {

    //Program to find Age range of the user
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) {                 // Getting input of Age from viewer
            System.out.println("Enter your Age:");
            int Age = sc.nextInt();


            if (Age >= 18 && Age < 19) {                            // Checking conditions 
                System.out.println("An Adult");                  // Printing out the specified outputs
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
