package Jobsheet5;

import java.util.Scanner;

public class AksesLayananKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Campus Library & Wi-Fi Access System ===");
        System.out.print("Is your student ID / membership card active? (true/false): ");
        boolean isRegistered = sc.nextBoolean();

        if (isRegistered) {
            System.out.println("Access Granted!");
            System.out.println("- You are allowed to borrow books from the library.");
            System.out.println("- Campus Wi-Fi Connected: [Polinema_Cyber]");
        } else {
            System.out.println("Access Denied!");
            System.out.println("- Please register at the administrative office to gain access.");
        }
    }
}