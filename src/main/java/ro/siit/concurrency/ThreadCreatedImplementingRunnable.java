package ro.siit.concurrency;

public class ThreadCreatedImplementingRunnable implements Runnable {

    @Override
    public void run(){
        for (int i = 0 ; i < 100; i+=3){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Current thread is: " + Thread.currentThread().getName() + " i === " + i);
        }
    }
}
