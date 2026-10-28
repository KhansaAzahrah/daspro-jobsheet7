import java.util.Scanner;

public class NetSalaryDynamic13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dinamis
        System.out.print("Masukkan gaji pokok         : ");
        double basicSalary = input.nextDouble();

        System.out.print("Masukkan tunjangan per anak  : ");
        double childAllowancePerChild = input.nextDouble();

        System.out.print("Masukkan jumlah anak         : ");
        int numberOfChildren = input.nextInt();

        double pensionPercent = 0.05;

        double totalChildAllowance = childAllowancePerChild * numberOfChildren;
        double pensionDeduction = pensionPercent * basicSalary;
        double netSalary = basicSalary + totalChildAllowance - pensionDeduction;

        System.out.println("\nGaji pokok           : Rp" + basicSalary);
        System.out.println("Tunjangan anak (" + numberOfChildren + ")  : Rp" + totalChildAllowance);
        System.out.println("Potongan pensiun (5%) : Rp" + pensionDeduction);
        System.out.println("Gaji bersih           : Rp" + netSalary);

        input.close();
    }
}