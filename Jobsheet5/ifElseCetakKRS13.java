package Jobsheet5;

import java.util.Scanner;

public class ifElseCetakKRS13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.println("Enter current semester");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 is displayed");
        } else if (semester == 2) {
            System.out.println("KRS semester 2 is displayed");
        } else if (semester == 3) {
            System.out.println("KRS semester 3 is displayed");
        } else if (semester == 4) {
            System.out.println("KRS semester 4 is displayed");
        } else if (semester == 5) {
            System.out.println("KRS semester 5 is displayed");
        } else if (semester == 6) {
            System.out.println("KRS semester 6 is displayed");
        } else {
            System.out.println("Invalid semester");
        }

        sc.close();
    }

}
