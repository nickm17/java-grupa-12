package ro.siit.concurrency;

public class ProdConsExample {

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
//        Producer producer2 = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
//        producer2.start();
        consumer.start();

        System.out.println("Duration" + (now-System.currentTimeMillis()));
    }
}
