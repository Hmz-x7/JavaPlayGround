package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new threadClass();
        Thread thread2 = new threadClass();
        thread1.setName("molly");
        thread2.setName("lora");
        Runnable ds = () -> {
            int x = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " : this is thread " + x);
            }
            x++;
        };
        //we are executing the multithreaded function here, so they are printing the
        //numbers from 1 -> 10 concurrently
        thread2.start();
        thread1.start();
        ds.run();
        ds.run();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is runnable class ");
            }
        });
        executorService.submit(() -> System.out.println("this is the runnable lambda in the executor service "));

        // it's good practice shutdown the service after finishing otherwise will keep running forever : )
        executorService.shutdown();
    }
}
