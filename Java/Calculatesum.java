
import java.util.*;

class Calculatesum{

// Function with Parameters and no Return Type:
    
public static void calSum(int num1, int num2){
    int sum = num1 +num2;
    System.out.println("Sum is: " + sum);

}
public static void main(String args[]){
    try (Scanner sc = new Scanner (System.in)) {
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        calSum(a,b);
    }
}
}