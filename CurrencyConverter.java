import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Currency Converter ---");
        System.out.print("Enter Base Currency (e.g., USD): ");
        String base = sc.next();
        System.out.print("Enter Target Currency (e.g., INR): ");
        String target = sc.next();

        System.out.print("Enter Exchange Rate (1 " + base + " to " + target + "): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Amount to convert: ");
        double amount = sc.nextDouble();

        double convertedAmount = amount * rate;
        System.out.println("\nResult: " + amount + " " + base + " = " + convertedAmount + " " + target);
        
        sc.close();
    }
}
