package Java;

import java.util.*;

public class Hello {

    // Program to Hello to the viewer
    public static void main(String args[]) {
        // Calling Scanner Funtion for Input
        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Are You a Java Coder? Press 1 for Yes or 0:");

            // Input Variable type
            int Input = var.nextInt();

            // For specified output
            if (Input == 1) {
                System.out.println("Hello! High Five to you. Keep Going!!");
            } else {
                System.out.println("Hello You! No problem. You are on right path.");
            }

        }
    }
}
