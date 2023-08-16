import java.util.*;

public class ArrayOperations {
    // data
    public int[] data() {
        Scanner sc;
        int a[] = new int[5];
        sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter a number:");
            a[i] = sc.nextInt();

        }
        ;

        return a;
    };

    public int[] order(int[] a) {
        // ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        ;
        // print array a
        for (int x = 0; x < a.length; x++) {
            System.out.println("Ascending array :" + a[x]);
        }
        ;
        // Decending order
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        ;
        // Print Space to organise
        System.out.println("");
        // print array a
        for (int x = 0; x < a.length; x++) {
            System.out.println("Descending  array :" + a[x]);

        }

        ;
        return a;
    }

    public int[] maximum(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("Max number is " + max);
        return a;
    }

    // search
    public int[] search(int[] a) {
        Scanner sc;
        int search_input;
        boolean found = false;
        sc = new Scanner(System.in);
        System.out.println("Enter a number to search:");
        search_input = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search_input) {
                found = true;
                break;
            }

        }
        if (found == true) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        return a;
    }

    // main
    public static void main(String[] args) {
        ArrayOperations ob = new ArrayOperations();

    }
}

class UseArrayOps {

    public static void main(String[] args) {
        Scanner sc;
        // int menu_input;
        ArrayOperations ob = new ArrayOperations();

        int choice;
        sc = new Scanner(System.in);
        // interger Input

        do {
            System.out.println("Menu:");
            System.out.println("1. Input");
            System.out.println("2. Sort");
            System.out.println("3. Find Max");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ob.data();
                    break;

                case 2:
                    ob.order(ob.data());
                    break;

                case 3:
                    ob.maximum(ob.data());
                    break;

                case 4:
                    ob.search(ob.data());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}