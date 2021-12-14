package com.example.designpattern.behavior.observer;

/**
 * 观察者2号
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 16:04
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        String result = Integer.toHexString(subject.getState()).toUpperCase();
        System.out.println("订阅的数据发生变化，新的数据处理为十六进制值为：" + result);
    }
}
