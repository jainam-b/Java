// Wap to create a class HRA DA || empId and basic salary in one construct
// it also has method netSAL =bs+hra+da
// DA=27%of basic
//  HRA=12%of bs
//

import java.util.Scanner;

public class details {
    double salary;
    int empId;
    private double HRA = 0.12 * salary;
    private double DA = 0.20 * salary;
    public double netSal;

    class Employee {

    }

public double calculateDA() {
   
    return 0.27 * salary;
}
public double calculateHRA() {
   
    return 0.12 * salary;
}
public double netSAL() {
   
    return  salary+calculateHRA()+calculateDA();
}

}

class UseDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        details obarr[] = new details[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Id of Employee:");
            int empId = sc.nextInt();
            System.out.println("Enter Salary of Employee:");
            int salary = sc.nextInt();

            
        } // for loop end
    } // psvm
} //
