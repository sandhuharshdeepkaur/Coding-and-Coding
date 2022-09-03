
// 4. Hackerrank Stdin and Stdout || Program

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {                     // Main Function
        Scanner scan = new Scanner(System.in);                  // Input Function
        int i = scan.nextInt();                                // Input for Integer datatype 
        double d = scan.nextDouble();                         // Input for Double datatype
        scan.nextLine();
        String s = scan.nextLine();                          // Input for String datatype  
        scan.close();

        

        System.out.println("String: " + s);                 // Printing the Output
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
