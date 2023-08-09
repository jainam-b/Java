class Overload {
    void add() {
        int c = 12 + 12;
        System.out.println("Addition=" + c);
    }

    void add(int a) {
        int c = a + 10;
        System.out.println("Addition=" + c);
    }

    void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition=" + c);
    }

    void add(int a, String s) {

        System.out.println("Addition=" + a + s);
    }

    void add(String s, int a) {

        System.out.println("Addition=" + s + a);
    }
    void add(double a, double b) {
        double c = a + b;
        System.out.println("Addition=" +c);
    }

}

class UserOverload {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        ob.add(12);
        ob.add(12, 12);
        ob.add(12, "Hello");
        ob.add("Hello", 12);
        ob.add(12.5, 12.5);
    }
}
