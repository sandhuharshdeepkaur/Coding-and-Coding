package Java;

import java.util.*;

public class Primenum {
    
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n == 2){
                System.out.println(n + " is Prime number");
            } else{
                boolean isPrime = true;
                for (int i = 2; i <= n-1; i++){
                    if (n % i == 0){
                        isPrime = false;
                    }
                    if (isPrime = true){
                        System.out.println(n + " is Prime Number.");
                    }else{
                        System.out.println(n + " is not a Prime Number.");
                    }
                }
            }
        }
        }
    }
