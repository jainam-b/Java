import java.util.*;
public class SwitchCase {
    public static void main(String args[]){
        Scanner sc;
        int i;
        sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        i=sc.nextInt();
        switch(i){
            case 1:
            System.out.println("Enter 1 ");
            break;
            case 2:
            System.out.println("Enter 2 ");
            case 3:
            System.out.println("Enter 3 ");
            break;
            default:
            System.out.println("Entered number is larger than three");
        }
    }
}
