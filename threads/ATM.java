package threads;

public class ATM {
    // here we are using the synchronized keyword to avoid more than one thread to enter the function
    public synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if (balance - amount < 0) {
            System.out.println("Transaction denied");
        } else {
            System.out.println("Handling transaction...");
            account.debit(amount);
            System.out.println("$" + amount + " withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}