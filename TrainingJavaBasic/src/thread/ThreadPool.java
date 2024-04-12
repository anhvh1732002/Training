package thread;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        //ThreadPoolExecutor
//        //Minimum thread in ThreadPool
//        int corePoolSize = 5;
//        //Maximum thread in ThreadPool
//        int maximumPoolSize = 10;
//        //Max waiting time
//        long keepAliveTime = 500;
//        //The unit of keepAliveTime
//        TimeUnit unit = TimeUnit.SECONDS;
//
//        //Queue contain Thread
//        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
//
//        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
//
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
//                maximumPoolSize, keepAliveTime, unit, workQueue, handler);
//        for (int i = 0; i < 10; i++) {
//            threadPoolExecutor.execute(new Run(i));
//        }
        //ExecutorService
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            pool.submit(new Run(i));
        }
        try {
            pool.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();
    }
}
