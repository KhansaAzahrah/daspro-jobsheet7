import java.util.Scanner;

public class task3AssistantSelection13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActive, isSanctioned, hasCertificate;
        int programmingGrade, interviewScore;

        System.out.print("Is the student active? (true/false): ");
        isActive = sc.nextBoolean();
        System.out.print("Is the student under academic sanction? (true/false): ");
        isSanctioned = sc.nextBoolean();

        if (isActive && !isSanctioned) {
            System.out.print("Fundamentals of Programming grade: ");
            programmingGrade = sc.nextInt();
            System.out.print("Has programming competency certificate? (true/false): ");
            hasCertificate = sc.nextBoolean();

            if (programmingGrade >= 80 || hasCertificate) {
                System.out.print("Interview score: ");
                interviewScore = sc.nextInt();

                if (interviewScore >= 75) {
                    System.out.println("Accepted as laboratory assistant");
                } else {
                    System.out.println("Failed final selection: interview score is below 75");
                }
            } else {
                System.out.println("Failed initial selection: grade is below 80 and no programming competency certificate");
            }
        } else {
            System.out.println("Cannot take part in the selection: student must be active and not under academic sanction");
        }
    }
}