package org.example.test;

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("单例模式已被破坏，禁止通过反射创建实例。");
        }
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
