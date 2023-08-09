import java.util.*;
public class Distinction {
    double l,b,f;
    void convert(){
        f=l/30.48;
        System.out.println("Feet:"+f);
    }

    public static void main(String[] args) {
        Distinction ans=new Distinction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        ans.l=sc.nextDouble();
        ans.convert();
    }
}
