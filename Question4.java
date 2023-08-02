// Write a java program to accept 10 int form user and store it in an array print the array in asd and desc order
// Accept 10 int from user and store in an array and accept one int form user and check whether the number is present in array or not and print that number

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc;
        int a[] = new int[5];
        sc = new Scanner(System.in);
        // Loop for taking numbers
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number:");
            a[i] = sc.nextInt();
        }

        // Loop for ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; }  } };


               for(int x=0;x<a.length;x++){
            System.out.println("Sorted array :"+a[x]);}        
            sc.close();
    }

}
