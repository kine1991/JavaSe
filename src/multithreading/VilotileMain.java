package multithreading;

/**
 * Created by nikolaj on 19.07.17.
 */
public class VilotileMain {

    int i;

    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static class MyThreadWrite extends Thread{
        @Override
        public void run(){}
    }

    static class MyThreadRead extends Thread{
        @Override
        public void run(){}
    }





}
