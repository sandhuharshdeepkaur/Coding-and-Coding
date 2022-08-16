package Java;

import java.util.*;

public class Hello {
    // private static final String Y = null;

    public static void main(String args[]) {
        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Are You a Java Coder? Press 1 for Yes or 0:");
            int Input = var.nextInt();

            if (Input == 1) {
                System.out.println("Hello! High Five to you. Keep Going!!");
            } else {
                System.out.println("Hello You! No problem. You are on right path.");
            }

        }
    }
}
