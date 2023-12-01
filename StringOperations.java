// import java.util.Scanner;

// public class teams {
//     public static void main(String[] args) {
//         Scanner sc;
//         String a;
//         String repString;

//         String sub;
//         sc = new Scanner(System.in);
//         // Accept the string
//         System.out.println("Enter string:");
//         a = sc.nextLine();
//         // Lenght of the string 
//         System.out.println(a.length());

//         // Find the string 
//         System.out.println("Enter substring to find:");
//         sub = sc.nextLine();
//         System.out.println(a.contains(sub));

//         // Find and replace 
//         if (a.contains(sub) == true) {
//             System.out.println("Enter substring to repString:");
//             repString = sc.nextLine();
//             System.out.println(a.replace(a, repString));
             
//         } else {
//             System.out.println("  substring  not found  :");

//         }
//         // end of if 

//         // System.out.println(a.reverse());


//     }
// }

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int choice;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. Length");
            System.out.println("2. Find");
            System.out.println("3. Find and Replace");
            System.out.println("4. Reverse");
            System.out.println("5. Palindrome");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    int length = inputString.length();
                    System.out.println("Length of the string: " + length);
                    break;
                case 2:
                    System.out.print("Enter substring to find: ");
                    String substring = scanner.nextLine();
                    boolean found = inputString.contains(substring);
                    System.out.println("Substring found: " + found);
                    break;
                case 3:
                    System.out.print("Enter string to find: ");
                    String findStr = scanner.nextLine();
                    System.out.print("Enter string to replace with: ");
                    String replaceStr = scanner.nextLine();
                    String replacedString = inputString.replace(findStr, replaceStr);
                    System.out.println("Modified string: " + replacedString);
                    break;
                case 4:
                    StringBuilder reversed = new StringBuilder(inputString).reverse();
                    System.out.println("Reversed string: " + reversed);
                    break;
                case 5:
                    // boolean isPalindrome = isPalindrome(inputString);
                    // System.out.println("Is Palindrome: " + isPalindrome);
                    // break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
        
        scanner.close();
    }}
