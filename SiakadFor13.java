import java.util.Scanner;

public class SiakadFor13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade, highest = 0, lowest = 100;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            grade = input.nextDouble();

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Number of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);
    }
    
}