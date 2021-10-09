package com.example.designpattern.create.singleton;

/**
 * 双重检查
 * 指的是两次检查 instance 是否为 null。
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/7 17:07
 */
public class DoubleCheckSingleton {
    private DoubleCheckSingleton() {}
    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    private static volatile DoubleCheckSingleton instance = null;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            // 加锁
            synchronized (DoubleCheckSingleton.class) {
                // 这一次判断也是必须的，不然会有并发问题
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
