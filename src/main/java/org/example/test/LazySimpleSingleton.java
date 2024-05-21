package org.example.test;

public class LazySimpleSingleton {
    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
        if (instance != null) {
            throw new RuntimeException("单例模式已被破坏，禁止通过反射创建实例。");
        }
    }
  
    public static LazySimpleSingleton getInstance() {  
        if (instance == null) {  
            instance = new LazySimpleSingleton ();  
        }  
        return instance;  
    }  
}