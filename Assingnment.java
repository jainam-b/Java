import java.util.*;

public class Assingnment {
    public static void main(String[] args) {
        Scanner sc;
        int menu_input;
        int n,
        cubeSum = 0, num, r;
        int integer;
         int reverse=0;
        sc = new Scanner(System.in);
        // interger Input
        System.out.println("Enter a integer");
        integer = sc.nextInt();
        // Menu input
        System.out.println("Enter a number from Menu");

        System.out.println("1:Print Reverse:");
        System.out.println("2:Print Factors:");
        System.out.println("3:Check whether number is  prime or not :");
        System.out.println("4:Check whether a number is armstrong or not :");
        System.out.println("5:Exit");

        menu_input = sc.nextInt();

        switch (menu_input) {

            case 1:
                System.out.println("Print Reverse");
                while(integer!=0){
                    int remainder=integer%10;
                   reverse=reverse*10+remainder;
                   integer/=10;
                   
                
                };
                System.out.println(reverse);
                break;

            case 2:
                System.out.println(" Factorial of " + integer);
                for (int i = 1; i < integer; i++) {
                    if (integer % i == 0) {
                        System.out.println(i);

                    }

                }
                break;
            case 3:
                System.out.println("Check whether number is  prime or not");
                for(int i=2;i<=integer;i++){
                if(integer%i==0){
                    System.out.println("Not a Prime number ");
                    // break;
                }
            
                else{
                    System.out.println(" Prime number ");
                }
                break;
            }
                break;
            case 4:
                System.out.println("Check whether a number is armstrong or not");
                while (integer > 0)
                {
                    r = integer % 10;
                    cubeSum = cubeSum + (r * r * r);
                    num = integer / 10;
                }
                if (integer == cubeSum)
                {
                    System.out.println("Armstrong Number");
                }
                else
                {
                    System.out.println("Not Armstrong Number");
                }
            
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Out of menu");

        }
    }
}
