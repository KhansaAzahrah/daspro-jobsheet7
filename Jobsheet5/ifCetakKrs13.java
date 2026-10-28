package Jobsheet5;

import java.util.Scanner;

public class ifCetakKrs13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.print("Have the tuition fees been paid in full? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Using Ternary Operator
        String result = uktLunas 
            ? "UKT payment has been verified\nKRS now can be printed and you can ask the academic advisor to sign it." 
            : "Registration rejected. Please pay UKT first.";

        System.out.println(result);
    }
}