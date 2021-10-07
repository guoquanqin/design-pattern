package com.example.designpattern.singleton;

/**
 * 饿汉变种
 * 表面上看起来差别挺大，其实跟com.example.designpattern.SingletonPattern.HungrySingleton差不多，都是在类初始化即实例化instance
 * @author guoquanqin
 * @version 1.0, 2021/10/7 16:59
 */
public class HungrySingletonVariant {
    private static HungrySingletonVariant instance = null;
    static{
        instance = new HungrySingletonVariant();
    }
    private HungrySingletonVariant(){}
    public static HungrySingletonVariant getInstance(){
        return instance;
    }
}
