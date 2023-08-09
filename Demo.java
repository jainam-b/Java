// Method Demo 
import java.util.*;

public class Demo {
    int a, b, c;

    void add() {
        c = a * b;
        System.out.println("Multiplication: " + c);
    }

    public static void main(String[] args) {
        Demo ob = new Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        ob.a = sc.nextInt();
        System.out.println("Enter Number:");
        ob.b = sc.nextInt();
        ob.add();
    }
}
