
// 3. Hackerrank Java If-Else Program

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);     // Input Method used for input number

    public static void main(String[] args) {                          // Main Functionn of thr program
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N % 2 != 0){                                               // Condition to check the number is Odd
            System.out.println("Weird");
        }else if (N >= 6 && N <= 20){                                // Condition to check numbers lie between 6 to 20
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}