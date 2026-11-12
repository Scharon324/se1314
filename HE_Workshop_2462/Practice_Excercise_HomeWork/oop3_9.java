// A Man  purchase goods from a store. The store offers 5% discount, if the sale is more than 1000P; offers 10%
// discount if the sale is more than 2000P, if the sale is less than 1000P, no discount. For an input amount.
// Create a receipt invoice showing total sale, discount and price to pay.
import java.util.Scanner;
public class oop3_9
{
    static Scanner sc;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total sale amount in P: ");
        double totalSale = scanner.nextDouble();

        double discount = calculateDiscount(totalSale);
        double priceToPay = totalSale - discount;

        System.out.println("\nReceipt Invoice:");
        System.out.println("-----------------");
        System.out.printf("Total Sale: %.2fP\n", totalSale);
        System.out.printf("Discount: %.2fP\n", discount);
        System.out.printf("Price to Pay: %.2fP\n", priceToPay);

        scanner.close();
    }

    public static double calculateDiscount(double saleAmount) {
        if (saleAmount > 2000) {
            return saleAmount * 0.10; // 10% discount
        } else if (saleAmount > 1000) {
            return saleAmount * 0.05; // 5% discount
        } else {
            return 0; // No discount
        }
    }
}