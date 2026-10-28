import java.util.Scanner;

public class nestedThesisExam13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.print("Has the student cleared all compensation hours? (Yes/No): ");
        String compensationCleared = sc.nextLine().trim();

        System.out.print("Enter the number of supervision logs with Supervisor 1: ");
        int supervisionP1 = sc.nextInt();

        System.out.print("Enter the number of supervision logs with Supervisor 2: ");
        int supervisionP2 = sc.nextInt();

        if (compensationCleared.equalsIgnoreCase("Yes")) {
            if (supervisionP1 >= 8 && supervisionP2 >= 4) {
                message = "All requirements met. The student may register for the thesis exam";
            } else if (supervisionP1 < 8 && supervisionP2 < 4) {
                message = "Failed! P1 supervision logs are fewer than 8 and P2 fewer than 4";
            } else if (supervisionP1 < 8) {
                message = "Failed! P1 supervision logs have not reached 8";
            } else {
                message = "Failed! P2 supervision logs have not reached 4";
            }
        } else {
            message = "Failed! The student still has outstanding compensation hours";
        }

        System.out.println(message);
        sc.close();
    }
}