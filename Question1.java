// Write a java program to accept 10 numbers form users print addition of all 10
// numbers
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc;
        int num;
        int sum = 0;
        sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number :");
            num = sc.nextInt();
            sum = sum + num;

        }
        System.out.println("Sum of digits :" + sum);
    }
}

