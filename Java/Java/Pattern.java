package Java;

// Program to print different Patterns

public class Pattern {

    public static void pattern1(){               // Method to Print Half Pyramid of Stars
        
        int n = 5;
        for (int i = 1; i <= n; i++){           // For loop used for the lines
            for (int s = 1; s <= i; s++){      // For loop used for the Stars  
                System.out.print("*");      // Printing the Stars
            }
            System.out.println();            // Going to the next line
        }
    }

    public static void pattern3(){              // Method to find Half Pyramid of Numbers
        int n = 5;
        for (int i = 1; i <= n; i++){          // Outer loop for lines
            for (int j = 1; j <= i; j++){     // Inner loop for numbers
                System.out.print(i);         // Printing the numbers
            }
            System.out.println();           // Going to next line 
        }
    }

    public static void pattern2(){                     // Method to find Half Pyramid of Numbers
        int n = 5;                                    // Taking input
        for (int i = 1; i <= n; i++){                // Outer loop for lines 
            for(int s = 1; s <= (n-i+1); s++){      // Inner loop for stars
                System.out.print("*");           // Printing the stars
            }
            System.out.println();                 // Next line
        }
    }

    public static void pattern4(){                                    // Method to print Half Pyramid using characters
        int n = 5;                                                   // Input for character
        char ch = 'A';                                              // Initializing character starting
        for (int i = 1; i <= n; i++){                              // Outer loop for lines
            for (int chars = 1; chars <= i; chars++){             // Inner loop foe characters
                System.out.print(ch);                            // Printing Characters
                ch++;                                           // Incrementing characters to avoid repeatation
            }
            System.out.println();                              // Next line
        }
    }

    public static void pattern5(){

        int n = 5; 
        
        for(int i = 1; i <= n; i++){
            
            for(int j = 5; j >= i; j--){
                System.out.print(j+ " ");
                
            }
            System.out.println();
        }
    }

    


    public static void main(String args[]){
        pattern1();

        pattern2();
        
        pattern3();
        
        pattern4();

        pattern5();
    }
}  

