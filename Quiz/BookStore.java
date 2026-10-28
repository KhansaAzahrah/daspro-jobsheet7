package Quiz;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String buyerName;
        String bookTitle;
        double bookPrice;
        double discountRate = 0.15;
        double taxRate = 0.10;
        double taxAmount;
        double totalPayment;
        int BookQuantity;


        System.out.print("Enter the buyer's name: ");
        buyerName = input.nextLine();

        System.out.print("Enter the book title: ");
        bookTitle = input.nextLine();

        System.out.print("Enter the book price (Rp): ");
        bookPrice = input.nextDouble();

        System.out.print("Enter the quantity of books: ");
        BookQuantity = input.nextInt();

        double totalPrice = bookPrice * BookQuantity;
        double discountAmount = totalPrice * discountRate;
        taxAmount = (totalPrice - discountAmount) * taxRate;
        totalPayment = totalPrice - discountAmount + taxAmount;

        System.out.println("\n--- Payment Receipt ---");
        System.out.println("Buyer's Name: " + buyerName);   
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Price: Rp " + (long) bookPrice);
        System.out.println("Quantity: " + BookQuantity);
        System.out.println("Total Price: Rp " + (long) totalPrice);
        System.out.println("Discount Amount: Rp " + (long) discountAmount);
        System.out.println("Tax Amount: Rp " + (long) taxAmount);
        System.out.println("Total Payment: Rp " + (long) totalPayment);
        input.close();

    }
    
}
