package Jobsheet5;

import java.util.Scanner;

public class switchCetakKRS13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.println("Enter current semester");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS semester 1 is displayed");
                break;
                    case 2:
                        System.out.println("KRS semester 2 is displayed");
                break;
            case 3:
                System.out.println("KRS semester 3 is displayed");
                break;
            case 4:
                System.out.println("KRS semester 4 is displayed");
                break;
            case 5:
                System.out.println("KRS semester 5 is displayed");
                break;
            case 6:
                System.out.println("KRS semester 6 is displayed");
                break;
            default:
                System.out.println("Invalid semester");
        }
        sc.close();
    }
}
