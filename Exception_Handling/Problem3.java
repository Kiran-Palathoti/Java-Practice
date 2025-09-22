/*
 * Bank Account Simulation
Create a class BankAccount with methods:

deposit(double amount)

withdraw(double amount)
Throw a custom exception InsufficientFundsException if withdrawal amount is more than balance.
 */
public class Problem3 {

    // Custom Exception
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // BankAccount Class
    static class BankAccount {
        double balance = 1000;

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }

        void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Not enough funds! Current Balance: " + balance);
            }
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
        }
    }

    // Main Method
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        try {
            b.deposit(500);
            b.withdraw(300);   // valid
            b.withdraw(2000);  // will throw exception
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Transaction Completed.");
        }
    }
}
