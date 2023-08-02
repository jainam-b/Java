// Write a java program to accept a int from user and print sum of digit of that
// number .
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc;
        int num;
        int sum=0;
        sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        while(num != 0 ){
            sum=sum+num %10;
            num=num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
