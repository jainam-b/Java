import java.util.*;
public class UserInput {
    public static void main (String args[]){
        Scanner sc;
        int a , b  ;
        int c;
        sc = new Scanner(System.in);
        System.out.println("Enter values of a");
        a=sc.nextInt();
        System.out.println("Enter values of b");
        b=sc.nextInt();
        System.out.println("Enter third number c:");
        c=sc.nextInt();
        if(a>b && a>c ){
            System.out.println("Greater number is A="+a);
        }
        else if (b>c && b>a){
            System.out.println("Greater number id B="+b);
        }
        else{
            System.out.println("Greater number id C="+c);
        }



    }
}
