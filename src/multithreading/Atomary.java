package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by nikolaj on 19.07.17.
 */
public class Atomary {
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int j = 0; j<1000; j++){
            new MyThread().start();
        }
        System.out.println(atomicInteger.get());
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }

}
