
// 5. Hackerrank Java Output Formatting program 

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {                                // Main Function
            Scanner sc=new Scanner(System.in);                             // Input Function
            System.out.println("================================");
            for(int i=0;i<3;i++){                                         // Loop to check formatting condition
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);          // Output Formatting
            }
            System.out.println("================================");   // Printing Output

    }
}
