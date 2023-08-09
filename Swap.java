// swap will is not possible in passing values
class Swap {
    void fill(int a[]) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + j;
            j++;
        }
    }

    void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
}

 class FillDemo_C {
    public static void main(String[] args) {
        int b[] = { 56, 67, 98, 90, 356, 654 };
        System.out.println("Original Array");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "\t");
        }

        Swap ob = new Swap();
        ob.fill(b);
        System.out.println("After fill");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "\t");
        }
        int x=23;int y=45; 
        ob.swap(x,y);
        System.out.println("\n X="+x+"\t Y="+y);
    }

}
