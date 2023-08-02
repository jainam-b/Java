// Write a java program to accept percentage of marks from user and print the
// grade
// >90 O
// 80-90 A+
// 80-70 A
// 70-60 B+
// 60-50 B
// 50-40 C
// 40-30 P
// <30 F
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc;
        int num;
        int sum=0;
        sc = new Scanner(System.in);
        System.out.println("Enter a Percentage:");
        num=sc.nextInt();
        if(num>90){
            System.out.println("Grade O");
        }
        else if ( num<90 && num>80){
            System.out.println("Grade A+");
        }
        else if ( num<80 && num>70){
            System.out.println("Grade A");
        }
        else if ( num<70 && num>60){
            System.out.println("Grade B+");
            
        }
        else if ( num<60 && num>50){
            System.out.println("Grade B");
            
        }
        else if ( num<50 && num>40){
            System.out.println("Grade C");
            
        }
        else if ( num<40){
            System.out.println("Fail");
            
        }
        sc.close();
    }
}
