package multithreading;

/**
 * Created by nikolaj on 17.07.17.
 */
public class Ticket implements Runnable {

    private final String name;

    public Ticket(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
        System.out.println(i);
            try {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
