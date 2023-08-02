import java.util.*;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number for array A:");
                a[i][j] = sc.nextInt();
                System.out.println("Enter number for array B:");
                b[i][j] = sc.nextInt();
                c[i][j] = a[i][j] + b[i][j];
               

            }

        }
         System.out.println("Result");
        //  Second loop starts 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
