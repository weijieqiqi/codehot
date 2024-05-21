package org.example.Hot150;
/**
 * @Author: WeiJ
 * @CreateDate: 2024/3/22 16:49 //创建时间
 * @UpdateDate: 2024/3/22 16:49 //更新时间
 * @Version: 1.0    //版本号
 * //饿汉式，直接创建，不管需不需要先把对象new出来
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){
        if (instance != null){
            throw new RuntimeException("单例模式已被破坏，禁止通过反射创建实例。");
        }
        showMessage();
    }
    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}