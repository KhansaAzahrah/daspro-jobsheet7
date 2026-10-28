import java.util.Scanner;

public class task1Largest13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, max;

        System.out.print("num1 = ");
        num1 = sc.nextInt();
        System.out.print("num2 = ");
        num2 = sc.nextInt();
        System.out.print("num3 = ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
            } else {
                max = num3;
            }
        } else {
            if (num2 > num3) {
                max = num2;
            } else {
                max = num3;
            }
        }

        System.out.println("Largest number: " + max);
    }
}