package multithreading;

/**
 * Created by nikolaj on 17.07.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        Resource resource = new Resource();
        resource.setI(5);
        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(resource.getI());
    }


}

class MyThread extends Thread{
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run(){
        resource.changeI();
    }
}

class Resource{
    private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public synchronized void changeI(){
        int i = this.i;
        i++;
        this.i=i;
    }

}