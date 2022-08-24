package Java;

// Program to print different Patterns

public class Pattern {

    public static void pattern1(){               // Fuction to Print Half Pyramid of Stars
        for (int i = 1; i <= 4; i++){           // For loop used for the lines
            for (int s = 1; s <= i; s++){      // For loop used for the Stars  
                System.out.print("*");      // Printing the Stars
            }
            System.out.println();            // Going to the next line
        }
    }

    public static void pattern2(){              // Function to find Half Pyramid of Numbers
        for (int i = 1; i <= 5; i++){          // Outer loop for lines
            for (int n = 1; n <= i; n++){     // Inner loop for numbers
                System.out.print(i);         // Printing the numbers
            }
            System.out.println();           // Going to next line 
        }
    }

    public static void pattern3(){              // Function to find Half Pyramid of Numbers
        int n = 4;
        for (int i = 1; i <= n; i++){
            for(int s = 1; s <= (n-i+1); s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        pattern1();
        pattern2();
        pattern3();
    }
}  

