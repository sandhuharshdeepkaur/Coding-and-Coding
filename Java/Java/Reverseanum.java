package Java;

import java.util.*;

// Program to print Reverse of the given number

public class Reverseanum{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number:");
            int n = sc.nextInt();

            int rev = 0;

            while(n > 0){
                int Last_d = n % 10;
                rev = ((rev*10) + Last_d);
                n /= 10;
            }
            System.out.println(rev);
        }
    }
}
