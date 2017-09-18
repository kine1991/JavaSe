package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by nikolaj on 17.07.17.
 */
public class ThreadExample {
    public static void main(String[] args) {
        Ticket first = new Ticket("First");
        Ticket second = new Ticket("Second");


        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(first);
        executorService.submit(second);

    }
}
