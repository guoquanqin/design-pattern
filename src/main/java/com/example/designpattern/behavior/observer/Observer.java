package com.example.designpattern.behavior.observer;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 16:04
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
