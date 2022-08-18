package Java;

import java.util.*;

public class Areaofsquare {

    // Program to find Area of Square
    public static void main(String agrs[]) {

        // Input for side of a square
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter side of a Square:");
            int side = scan.nextInt();

            System.out.println("Area of a Square =" + side * side);
        }
    }

}
