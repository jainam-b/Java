// public class DemoStatic {
//     static int a = 10;
//     int b;

//     static void inc() {
//         a++;
//     }

//     void printv() {
//         System.out.println("A=" + a + "\t B=" + b);
//     };

// }
// class UseStatic_C{
//     public static void main(String args[]){
//         DemoStatic.inc();
//         DemoStatic ob=new DemoStatic();
//         ob.printv();
//         ob.inc();
//         ob.printv();
//         ob1.inc();
//         ob.printv();

//     }
// }

class DemoStatic {
    private int a, b;

    public DemoStatic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printv() {
        System.out.println("A=" + a + "\t B=" + b);
    };

}
class UseDemo_C{
public static void main(String[] args) {
    DemoStatic ob=new DemoStatic(30, 40);
    ob.printv();
}}
