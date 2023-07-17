import java.util.*;

public class WhileDemo {
    public static void main(String args[]) {
        Scanner sc;
        int num ,sum=0 ;
        int i=0;
        sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        num= sc.nextInt();
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of all number till : "+num +" is = "+sum);



    }
}
