public class Passing_method {
    void fill(int a[]) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + j;
            j++;
        }
    }
}

class FillDemo_C {
    public static void main(String[] args) {
        int b[] = { 56, 67, 98, 90, 356, 654 };
        System.out.println("Original Array");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "\t");
        }

        Passing_method ob = new Passing_method();
        ob.fill(b);
        System.out.println("After fill");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "\t");
        }
    }
}