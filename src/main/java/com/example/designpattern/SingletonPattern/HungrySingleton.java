package com.example.designpattern.SingletonPattern;

/**
 * 饿汉
 * 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，这时候初始化instance显然没有达到lazy loading的效果。
 * @author guoquanqin
 * @version 1.0, 2021/10/7 16:59
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
