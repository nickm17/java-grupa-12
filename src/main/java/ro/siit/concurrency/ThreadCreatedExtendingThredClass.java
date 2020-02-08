package ro.siit.concurrency;

public class ThreadCreatedExtendingThredClass extends Thread {

    @Override
    public void run(){
        for (int i = 0 ; i < 100; i+=2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Current thread is: " + Thread.currentThread().getName() + " i === " + i);
        }
    }

}
