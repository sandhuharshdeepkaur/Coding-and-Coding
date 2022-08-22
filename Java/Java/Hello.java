package Java;

import java.util.*;

public class Hello {

    // Program to Hello to the viewer
    public static void main(String args[]) {

        
        try (Scanner var = new Scanner(System.in)) {                                       // Calling Scanner Funtion for Input
            System.out.println("Are You a Java Coder? Press 1 for Yes or 0:");

            int Input = var.nextInt();                                                    // Input Variable type

            if (Input == 1) {                                                            // For specified output
                System.out.println("High Five to you buddy! Keep Going!!");
            } else {
                System.out.println("Hello You! No problem. You are on right path.");
            }

        }
    }
}
