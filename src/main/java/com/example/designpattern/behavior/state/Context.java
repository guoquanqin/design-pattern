package com.example.designpattern.behavior.state;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:47
 */
public class Context {
    private State state;
    private String name;
    public Context(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return this.state;
    }
}
