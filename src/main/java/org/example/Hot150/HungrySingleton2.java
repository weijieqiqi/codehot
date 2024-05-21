package org.example.Hot150;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/22 17:07 //创建时间
 * @UpdateDate: 2024/3/22 17:07 //更新时间
 * @Version: 1.0    //版本号
 * 懒汉式
 */
public class HungrySingleton2 {

    private static HungrySingleton2 sins;

    private HungrySingleton2() {
        if (sins != null) {
            throw new RuntimeException("单例模式已被破坏，禁止通过反射创建实例。");
        }
    }

    public static HungrySingleton2 hungrySingleton2Class() {
        if (sins == null) {
            synchronized (HungrySingleton2.class) {
                if (sins == null) {
                    sins = new HungrySingleton2();
                } else {
                    throw new RuntimeException("单例模式已被破坏，禁止通过反射创建实例。");
                }
            }
        } else {
            throw new RuntimeException("单例模式已被破坏，禁止通过反射创建实例。");
        }
        showMessage();
        return sins;
    }

    public static void showMessage() {
        System.out.println("Hello, I am a singleton instance2!");
    }
}