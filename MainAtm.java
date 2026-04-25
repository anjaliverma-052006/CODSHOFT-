import java.util.Scanner;

class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) { this.balance = initialBalance; }
    public double getBalance() { return balance; }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
            return true;
        }
        System.out.println("Insufficient Balance.");
        return false;
    }
}

class ATM {
    private BankAccount account;
    public ATM(BankAccount account) { this.account = account; }
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            if (choice == 4) break;
            switch(choice) {
                case 1: System.out.println("Balance: " + account.getBalance()); break;
                case 2: System.out.print("Amount: "); account.deposit(sc.nextDouble()); break;
                case 3: System.out.print("Amount: "); account.withdraw(sc.nextDouble()); break;
            }
        }
    }
}

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM(new BankAccount(1000));
        atm.start();
    }
}
