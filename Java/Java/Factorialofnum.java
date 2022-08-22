package Java;

import java.util.*;

public class Factorialofnum{

    public static void main(String args[]){

        try (Scanner abc = new Scanner (System.in)) {
            System.out.println("Enter a Number to find it's Factorial:");
            int num1 = abc.nextInt();
            int Fact = 1;

            for (int i = 1; i <= num1; i++){
                
                Fact *= i;

                System.out.println("Factorial of " + num1 + "number is : " + Fact);
            } 



        } 
    }
}

