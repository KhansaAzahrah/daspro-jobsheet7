import java.util.Scanner;

public class task2BookDiscount13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;
        int qty;
        int discount;

        System.out.print("Book category (dictionary/novel/other): ");
        category = sc.nextLine().trim();
        System.out.print("Number of books: ");
        qty = sc.nextInt();

        if (category.equalsIgnoreCase("dictionary") && qty > 2) {
            discount = 12;
        } else if (category.equalsIgnoreCase("dictionary")) {
            discount = 10;
        } else if (category.equalsIgnoreCase("novel") && qty > 3) {
            discount = 9;
        } else if (category.equalsIgnoreCase("novel")) {
            discount = 8;
        } else if (qty > 3) { 
            discount = 5;
        } else {
            discount = 0;
        }

        System.out.println("Discount = " + discount + "%");
    }
}