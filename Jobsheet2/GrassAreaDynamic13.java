import java.util.Scanner;

public class GrassAreaDynamic13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dinamis
        System.out.print("Masukkan lebar tanah (m)          : ");
        double landWidth = input.nextDouble();

        System.out.print("Masukkan panjang tanah (m)        : ");
        double landLength = input.nextDouble();

        System.out.print("Masukkan diameter kolam lingkaran (m) : ");
        double circleDiameter = input.nextDouble();

        System.out.print("Masukkan sisi kolam persegi (m)   : ");
        double squareSide = input.nextDouble();

        double landArea = landWidth * landLength;

        double circleRadius = circleDiameter / 2;
        double circleArea = Math.PI * circleRadius * circleRadius;

        double squareArea = squareSide * squareSide;

        double grassArea = landArea - circleArea - squareArea;

        System.out.println("\nLuas tanah              : " + landArea + " m^2");
        System.out.println("Luas kolam lingkaran    : " + circleArea + " m^2");
        System.out.println("Luas kolam persegi      : " + squareArea + " m^2");
        System.out.println("Luas lahan untuk rumput : " + grassArea + " m^2");

        input.close();
    }
}