package org.example.test;

import java.lang.reflect.Constructor;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/8 10:49 //创建时间
 * @Version: 1.0    //版本号
 */
public class test002 {
    public static void main(String[] args) {
        try {
            LazySimpleSingleton instance = LazySimpleSingleton.getInstance();

            Class<LazySimpleSingleton> singletonClass = LazySimpleSingleton.class;

            Constructor<LazySimpleSingleton> constructor = singletonClass.getDeclaredConstructor();

            constructor.setAccessible(true);

            LazySimpleSingleton singleton = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}