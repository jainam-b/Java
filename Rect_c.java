import java.util.*;

public class Rect_c {
    private int l, b;

    public Rect_c(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int area() {
        return l * b;
    };

}

class UseRect_C {
    public static void main(String[] args) {
        Rect_c obarr[] = new Rect_c[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter value of l for Rectangle:" + i);
            int l = sc.nextInt();
            System.out.println("Enter value of b for Rectangle:" + i);
            int b = sc.nextInt();
            obarr[i] = new Rect_c(l, b);
        }
        ;

        for (int i = 0; i < 5; i++) {
            int a = obarr[i].area();
            System.out.println("Area of Rectangle" + i + "=" + a);

        }
    }
}
