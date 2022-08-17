package Java;

import java.util.*;

public class Average {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int Average = (A + B + C) / 3;
        System.out.println(Average);
    }

}
