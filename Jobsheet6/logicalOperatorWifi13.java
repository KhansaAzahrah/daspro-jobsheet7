import java.util.Scanner;

public class logicalOperatorWifi13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isStudent;
        boolean isLecturer;
        boolean isAccountBlocked;

        System.out.print("Is the user a student? (true/false): ");
        isStudent = sc.nextBoolean();

        System.out.print("Is the user a lecturer? (true/false): ");
        isLecturer = sc.nextBoolean();

        System.out.print("Is the account currently blocked? (true/false): ");
        isAccountBlocked = sc.nextBoolean();

        if ((isStudent || isLecturer) && !isAccountBlocked) {
            System.out.println("WiFi access granted");
        } else {
            System.out.println("WiFi access denied");
        }

        sc.close();
    }
}
