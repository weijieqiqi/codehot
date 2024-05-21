package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/1 16:03 //创建时间
 * @Version: 1.0    //版本号
 */
public class Test {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final Test test = new Test();

        for (int i = 0; i < 10; i++) {
           new Thread() {
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        test.increase();
                    }
                }
            }.start();
        }
        // 等待所有线程执行完成
        while (Thread.activeCount() > 1) {
            System.out.println("Thread.activeCount()" + Thread.activeCount());
            Thread.yield();
        }
        System.out.println("test：" + test.inc);

        // 输出结果

    }
}
