package com.example.designpattern.singleton;

/**
 * 懒汉，线程安全
 * 这种写法在getInstance()方法中加入了synchronized锁。能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是效率很低（因为锁），并且大多数情况下不需要同步。
 * @author guoquanqin
 * @version 1.0, 2021/10/7 16:56
 */
public class LazySingletonSafe {
    public static LazySingletonSafe instance;
    public LazySingletonSafe(){}
    public static synchronized LazySingletonSafe getInstance(){
        if (instance == null) {
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}
