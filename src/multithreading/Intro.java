package multithreading;


/**
 * Created by nikolaj on 17.07.17.
 */
public class Intro {
    public static void main(String[] args) {
        new Intro().doCounter();
    }

    private final Lock lock = new Lock();
    private int count = 0;



    private void increment(){
        synchronized (this){count++;}
    }

    void doCounter(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<1000000; i++){
                    increment();
                }
                System.out.println(count);

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<1000000; i++){
                    increment();
                }
                System.out.println(count);

            }
        });

        t1.start();
        t2.start();
    }
}

class Lock{
    private boolean isLocked = false;

    void lock() throws InterruptedException{
        synchronized (this){
            while (isLocked){
                wait();
            }
            isLocked=true;
        }
    }

    void unlock(){
        synchronized (this){
            isLocked = false;
            notify();
        }
    }
}
