import java.util.*;

public class Loop {
    public static void main(String[] args) {
        Scanner sc;
        int num;
        sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int r = num * i;
            System.out.println(r+"\t" );
        }
    }
}
