package Quiz;

import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String employeeName;
        double basicSalary;
        double taxRate = 0.10;
        double taxAmount;
        double totalSalary;

        System.out.print("Enter the employee's name: ");
        employeeName = input.nextLine();

        System.out.print("Enter the basic salary (Rp): ");
        basicSalary = input.nextDouble();

        taxAmount = basicSalary * taxRate;
        totalSalary = basicSalary - taxAmount;

       System.out.println("\n--- Salary Slip ---");
       System.out.println("Employee Name: " + employeeName);
       System.out.println("Basic Salary: Rp " + (long) basicSalary);
       System.out.println("Tax (10%): Rp " + (long) taxAmount);
       System.out.println("Total Salary to be Paid: Rp " + (long) totalSalary);

        input.close();

    }
}