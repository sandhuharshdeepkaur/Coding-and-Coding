package Java;

// Program to find the Binomial Coefficient 

public class BinoCoe {

    public static int Facto(int n){

        int Fact = 1;
        for (int i = 1; i <= n ; i++){
            
            Fact *= i;
        }
        return Fact;

    }

    public static int BinomialCoe(int n, int r){
        int Factorial_n = Facto(n);

        int Factorial_r = Facto(r);
        
        int Factorial_nr = Facto(n - r);

        int BinomialCoe = Factorial_n / (Factorial_r * Factorial_nr);
        return BinomialCoe;
    }
    public static void main(String ags[]){

        System.out.println(BinomialCoe(5, 2));
    }
}
