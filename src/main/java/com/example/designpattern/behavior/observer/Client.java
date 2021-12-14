package com.example.designpattern.behavior.observer;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 16:05
 */
public class Client {
    public static void main(String[] args) {
        // 先定义一个主题
        Subject subject = new Subject();
        // 定义观察者
        new BinaryObserver(subject);
        new HexaObserver(subject);

        // 模拟数据变更，这个时候，观察者们的 update 方法将会被调用
        subject.setState(11);
    }
}
