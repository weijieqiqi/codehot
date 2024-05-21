package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/23 16:07 //创建时间
 * @Version: 1.0    //版本号
 */
public class ThreeThread {
    private static final int MAX_COUNT = 100;
    private static volatile int count = 0;

    public static void main(String[] args) {
        Object lock = new Object();

        Thread t1 = new Thread(new PrintTask(0, lock));
        Thread t2 = new Thread(new PrintTask(1, lock));
        Thread t3 = new Thread(new PrintTask(2, lock));

        t1.start();
        t2.start();
        t3.start();
    }

    static class PrintTask implements Runnable {
        private final int threadId;
        private final Object lock;

        public PrintTask(int threadId, Object lock) {
            this.threadId = threadId;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (count > MAX_COUNT) {
                        break;
                    }
                    if (count % 3 == threadId) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

/*    private static final int MAX_COUNT = 100;
    private static volatile int count = 0;

    public static void main(String[] args) {*/
/*        Object lock = new Object();

        Thread thread1 = new Thread(new PrintTask(0, lock));
        Thread thread2 = new Thread(new PrintTask(1, lock));
        Thread thread3 = new Thread(new PrintTask(2, lock));

        thread1.start();

        thread2.start();

        thread3.start();

    }

    static class PrintTask implements Runnable {
        private final int threadId;
        private final Object lock;

        PrintTask(int threadId, Object lock) {
            this.threadId = threadId;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (count > MAX_COUNT) {
                        break;
                    }
                    if (count % 3 == threadId) {
                        System.out.println("thread" + threadId + ":" + count++);
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }*/

        /*Thread  thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 is running");
            }
        });

        Thread  thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread2 is running");
            }
        });

        Thread  thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread3 is running");
            }
        });

        thread3.start();
        thread2.start();
        thread1.start();*/

 /*       int i = 0;
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            i++;
        }finally {
            lock.unlock();
        }
        System.out.println(i);*/
       /* class MyRunable1 implements Runnable{
            @Override
            public void run() {
                System.out.println("MyRunable1");
            }
        }

        class MyRunable2 implements Runnable{
            @Override
            public void run() {
                System.out.println("MyRunable2");
            }
        }

        class MyRunable3 implements Runnable{
            @Override
            public void run() {
                System.out.println("MyRunable3");
            }
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new MyRunable1());
        executor.submit(new MyRunable2());
        executor.submit(new MyRunable3());
        executor.shutdownNow();*/

       /* ExecutorService executor = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(()->{
            System.out.println("thread1");
        });
        Thread thread2 = new Thread(()->{
            System.out.println("thread2");
        });
        Thread thread3 = new Thread(()->{
            System.out.println("thread3");
        });

        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);*/

    }

