package week03.invoice;
import java.util.Scanner;


public class Array15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many items? ");
        int n = scanner.nextInt();  

        Invoice[] invoices = new Invoice[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter part number: ");
            String partNumber = scanner.next();
            System.out.print("Enter part description: ");
            String partDescription = scanner.next();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter price per item: ");
            double pricePerItem = scanner.nextDouble();
            
            System.out.println();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }

        for (Invoice item : invoices) {
            
            double itemTotal = item.getInvoiceAmount();
            
            System.out.println("Invoice for " + item.getPartNumber() + ": $" + itemTotal);
        }


        scanner.close();
    }
}
