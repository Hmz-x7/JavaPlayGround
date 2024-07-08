package threads;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Customer {

    public static void main(String[] args) {

        //in this case sometimes you will find some unusual behaviours when using threads
        // you must be careful and use synchronized key  word to avoid any unusual behavior
        //note the use if it must be in the function as in our example was in the ATM class
        ATM atm = new ATM();
        BankAccount account = new BankAccount();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> atm.withdraw(account, 100));
        executorService.submit(() -> atm.withdraw(account, 100));

        executorService.shutdown();
    }

}