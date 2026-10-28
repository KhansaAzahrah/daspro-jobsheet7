import java.util.Scanner;

public class nestedLabAccess13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermission;
        boolean isLabAssistant;

        System.out.print("Is the student active? (true/false): ");
        isActiveStudent = sc.nextBoolean();

        System.out.print("Is the student under sanction? (true/false): ");
        isSanctioned = sc.nextBoolean();

        System.out.print("Does the student have lecturer permission? (true/false): ");
        hasLecturerPermission = sc.nextBoolean();

        System.out.print("Is the student a lab assistant? (true/false): ");
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermission || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirements");
        }

        sc.close();
    }
} 