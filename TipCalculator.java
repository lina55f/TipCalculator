import java.util.Scanner;

/**
 * Tip Calculator - v1.0
 * Core feature: compute the tip on a bill using a fixed tip percentage.
 */
public class TipCalculator {

    // Fixed tip percentage for v1.0 (custom % will be added in a feature branch)
    private static final double TIP_PERCENT = 15.0;

    public static double calculateTip(double bill) {
        return bill * TIP_PERCENT / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tip Calculator v1.0 ===");
        System.out.print("Enter the bill amount: ");
        double bill = scanner.nextDouble();

      System.out.print("Number of people: ");
        int people = scanner.nextInt();

        double tip = calculateTip(bill);
        double total = bill + tip;

        System.out.printf("Tip (%.0f%%): %.2f%n", TIP_PERCENT, tip);
        System.out.printf("Total:      %.2f%n", total);
        System.out.printf("Each pays:  %.2f%n", total / people);

        
        scanner.close();
    }
}
