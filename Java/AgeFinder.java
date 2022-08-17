package Java;

public class AgeFinder {

    public static void main(String args[]) {
        int Age = 45;

        if (Age >= 18 && Age < 19) {
            System.out.println("An Adult");
        } else if (Age > 13 && Age < 18) {
            System.out.println("A Teenager");
        } else if (Age < 13) {
            System.out.println("A Child");
        } else {
            System.out.println("Neither Adult Nor Teenager.");
        }

    }

}
