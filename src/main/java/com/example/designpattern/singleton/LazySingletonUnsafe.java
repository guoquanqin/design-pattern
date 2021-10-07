package com.example.designpattern.singleton;

/**
 * 懒汉，线程不安全
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作
 * @author guoquanqin
 * @version 1.0, 2021/10/7 16:50
 */
public class LazySingletonUnsafe {
    private static LazySingletonUnsafe instance;
    private LazySingletonUnsafe(){}
    public static LazySingletonUnsafe getInstance(){
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}
