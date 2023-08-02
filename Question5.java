// Write a program to accept 3 by 3 matrix from user calculate transpose of matrix
// Write a java program to multiple the matrix and print the multiply 

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number for array A:");
                a[i][j] = sc.nextInt();
                // System.out.println("Enter number for array B:");
                b[i][j] =a[j][i];
                  
                
            }

        }
          System.out.println("Output");
        //  Second loop starts 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
