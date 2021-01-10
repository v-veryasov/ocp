package concurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = null;

        Runnable runnable = () -> System.out.println("In Run!");
        new Thread(runnable).start();

        Callable<String> callable = () -> "In Call!";
        try {
            executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(callable);
            System.out.println(future.get());
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

        Stream<Integer> s3 = List.of(1,2).parallelStream();
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
