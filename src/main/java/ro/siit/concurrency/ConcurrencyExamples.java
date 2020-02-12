package ro.siit.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExamples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long now = System.currentTimeMillis();
//        example3Threads();
        //counterIncrementatDeMaiMulteThreaduri();

        Callable callable = () -> "result ++++";

        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Current thread is: " + Thread.currentThread().getName() +"  Current time :: " + LocalDateTime.now());
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(10);

//        executorService.execute(() -> {
//            try {
//                TimeUnit.MILLISECONDS.sleep(1000);
//                System.out.println("Current thread is: " + Thread.currentThread().getName() + "  Current time :: " + LocalDateTime.now());
//                System.out.println();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);
//        executorService.execute(runnableTask);

        Future<?> submitResult = executorService.submit(runnableTask);
        Future<?> submitResultCallable = executorService.submit(callable);

//        while(!submitResult.isDone()){
//            Thread.sleep(20);
//        }
        System.out.println(submitResult.isDone());
        System.out.println(submitResultCallable.get());

        executorService.shutdown();
        System.out.println("Duration" + (now-System.currentTimeMillis()));
    }

    private static void counterIncrementatDeMaiMulteThreaduri() {
        Counter counter = new Counter();

        Thread counterThread = new CounterThread(counter);
        Thread counterThread1 = new CounterThread(counter);
        Thread counterThread2 = new CounterThread(counter);
        Thread counterThread3 = new CounterThread(counter);

        counterThread.start();
        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
    }

    ///
    // System.exit(2);
    //        Runtime.getRuntime().exit(2);

    private static void example3Threads() {
        // creare thread-uri
        // varianta 1 clasa care extinde Thread
        ThreadCreatedExtendingThredClass threadCreatedExtendingThredClass = new ThreadCreatedExtendingThredClass();
        // varianta 2 clasa care implementeaza Runnable
        ThreadCreatedImplementingRunnable threadCreatedImplementingRunnable = new ThreadCreatedImplementingRunnable();
        Thread threadCreatedImplementingRunnableInstance = new Thread(threadCreatedImplementingRunnable);
        // lambda expression
        Thread threadCreatedUsingLambdaExpression = new Thread(() -> {
            for (int i = 0; i < 100; i += 5) {
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("Current thread is: " + Thread.currentThread().getName() + " i === " + i);
            }
        });

        threadCreatedExtendingThredClass.setName("threadCreatedExtendingThredClass");
        threadCreatedImplementingRunnableInstance.setName("threadCreatedImplementingRunnableInstance");
        threadCreatedUsingLambdaExpression.setName("threadCreatedUsingLambdaExpression");
        threadCreatedExtendingThredClass.start();
        threadCreatedImplementingRunnableInstance.start();
        threadCreatedUsingLambdaExpression.start();
    }


}
