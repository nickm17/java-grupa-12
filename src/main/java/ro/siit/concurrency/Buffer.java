package ro.siit.concurrency;

public class Buffer {
    private int number = -1;
    private boolean available = false;
    public synchronized int get() {
        if (!available) {
            try {
                wait(); // Wait for producer to put a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return number;
    }

    public synchronized void put(int number) {
        if (available) {
            try {
                wait(); // Wait for producer to put a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        available = true;
        notifyAll();
    }
}