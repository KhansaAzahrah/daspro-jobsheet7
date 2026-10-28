import java.util.Scanner;

public class CalculateAreaOfRectangleKhansa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length;
        double width; 
        double area;

        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();

        area = length * width;

        System.out.println("The area of the rectangle is: " + area);

        input.close();

    }
}