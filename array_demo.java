import java.util.*;

public class array_demo {
    public static void main(String[] args) {
        Scanner sc;
        int a[] = new int[5]; // 4 5 6 78
        sc = new Scanner(System.in);
       int  max=a[0];
        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter a number:");
            a[i] = sc.nextInt();
        };
        for (int i = 0; i < a.length; i++) {
            
                if (a[0] > max) {
                    max = a[i];
                }
            
        }
        System.out.println("Min number is " + max);

    }
}
